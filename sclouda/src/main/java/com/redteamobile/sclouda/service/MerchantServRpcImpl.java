package com.redteamobile.sclouda.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.redteamobile.scloud.CheckSignReq;
import com.redteamobile.scloud.CheckSignResp;
import com.redteamobile.scloud.MerchantServGrpc;
import com.redteamobile.sclouda.dao.MerchantDao;
import com.redteamobile.sclouda.model.entity.Merchant;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by yoruichi on 17/12/26.
 */
@GRpcService
public class MerchantServRpcImpl extends MerchantServGrpc.MerchantServImplBase {
    private Logger logger = LoggerFactory.getLogger(MerchantServRpcImpl.class);

    @Autowired
    private MerchantDao merchantDao;

    public String MD5(String input) {
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            logger.error("No such algorithm MD5, but this should not happen !!");
        } catch (UnsupportedEncodingException e) {
            logger.error("Unsupported encoding is used, but this should not happend !!");
        }

        byte byteData[] = md.digest();
        return DatatypeConverter.printHexBinary(byteData).toLowerCase();
    }

    public String SHA1(String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA1");
            md.update(input.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
        } catch (UnsupportedEncodingException e) {
        }

        byte byteData[] = md.digest();
        return DatatypeConverter.printHexBinary(byteData).toLowerCase();
    }

    @Override
    public void checkSign(CheckSignReq request, StreamObserver<CheckSignResp> responseObserver) {
        String body = request.getBody();
        String merchantCode = request.getMerchantCode();
        String accessKey = request.getAccessKey();
        String requestId = request.getRequestId();
        long timestamp = request.getTimestamp();
        String signType = request.getSignType();
        String sign = request.getSign();
        logger.info("Receive request with id {} and body {} for merchant code {}", requestId, body,
                merchantCode);
        CheckSignResp.Builder builder =
                CheckSignResp.newBuilder().setSuccess(false).setRequestId(requestId);
        if (Strings.isNullOrEmpty(body)
                || Strings.isNullOrEmpty(merchantCode)
                || Strings.isNullOrEmpty(accessKey)
                || Strings.isNullOrEmpty(sign)) {
            logger.warn("Missing required parameters in request.");
            responseObserver
                    .onNext(builder.setMessage("Missing required parameters in request.").build());
            responseObserver.onCompleted();
            return;
        }
        if (Math.abs(System.currentTimeMillis() - timestamp) > 10 * 60 * 1000) {
            logger.warn("Request time was not valid.Current timestamp is {} and request time is {}",
                    System.currentTimeMillis(), timestamp);
            responseObserver
                    .onNext(builder.setMessage("Request time was not valid.").build());
            responseObserver.onCompleted();
            return;
        }
        if (!signType.toUpperCase().equals("SHA1")) {
            logger.warn("Request signature type [{}] is not supported.", signType.toUpperCase());
            responseObserver
                    .onNext(builder.setMessage("Request signature type is not supported.").build());
            responseObserver.onCompleted();
            return;
        }
        try {
            JsonNode b = new ObjectMapper().readTree(body);
            Merchant merchant = merchantDao.select(Merchant.build().setCode(merchantCode));
            if (!accessKey.equals(merchant.getAccessKey())) {
                logger.warn("Wrong access key [{}] for given merchant [{}].Expected {}", accessKey, merchant.getAccessKey());
                responseObserver
                        .onNext(builder.setMessage("Wrong access key for given merchant.").build());
                responseObserver.onCompleted();
                return;
            }

            String strToSign = MD5(body).concat(merchant.getSecretKey());
            String expected = SHA1(strToSign);
            logger.info("Got sign {}, and expected {}.", sign, expected);
            if (!sign.equals(expected)) {
                logger.warn("Not valid sign.");
                responseObserver.onNext(builder.setMessage("Not valid sign.").build());
                responseObserver.onCompleted();
                return;
            }

            responseObserver.onNext(builder.setSuccess(true).build());
            responseObserver.onCompleted();

        } catch (IOException e) {
            logger.error("Error when parse body {} to JSON.Caused by: ", body, e);
            e.printStackTrace();
            responseObserver.onNext(builder.setMessage("Not valid JSON body in request.").build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.error("Error when query merchant with code {}. Caused by: ", merchantCode, e);
            e.printStackTrace();
            responseObserver.onError(new StatusException(Status.UNAVAILABLE));
        }
    }
}
