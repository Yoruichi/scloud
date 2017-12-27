package com.redteamobile.sclouda.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.redteamobile.scloud.CheckSignReq;
import com.redteamobile.scloud.CheckSignResp;
import com.redteamobile.scloud.MerchantServGrpc;
import com.redteamobile.sclouda.dao.MerchantDao;
import com.redteamobile.sclouda.model.entity.Merchant;
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
        if (Strings.isNullOrEmpty(body)
                || Strings.isNullOrEmpty(merchantCode)
                || Strings.isNullOrEmpty(accessKey)
                || Strings.isNullOrEmpty(sign)) {
            responseObserver.onError(new Exception("Missing required parameters in request."));
            return;
        }
        if (Math.abs(System.currentTimeMillis() - timestamp) > 10 * 60 * 1000) {
            responseObserver.onError(new Exception("Request time was not valid."));
            return;
        }
        if (!signType.toUpperCase().equals("SHA1")) {
            responseObserver.onError(new Exception("Request signature type is not supported."));
            return;
        }
        try {
            JsonNode b = new ObjectMapper().readTree(body);
            Merchant merchant = merchantDao.select(Merchant.build().setCode(merchantCode));
            if (!accessKey.equals(merchant.getAccessKey())) {
                responseObserver.onError(new Exception("Parameters missing in request."));
                return;
            }

            String strToSign = MD5(body).concat(merchant.getSecretKey());
            String expected = SHA1(strToSign);
            logger.debug("Got sign {}, and expected {}.", sign, expected);
            if (!sign.equals(expected)) {
                responseObserver.onError(new Exception("Not valid sign."));
            } else {
                responseObserver
                        .onNext(CheckSignResp.newBuilder().setSuccess(true).setRequestId(requestId)
                                .build());
                responseObserver.onCompleted();
            }
        } catch (IOException e) {
            logger.error("Error when parse body {} to JSON.Caused by: ", body, e);
            e.printStackTrace();
            responseObserver.onError(new Exception("Not valid JSON body in request."));
        } catch (Exception e) {
            logger.error("Error when query merchant with code {}. Caused by: ", merchantCode, e);
            e.printStackTrace();
            responseObserver.onError(new Exception("Not valid merchant code in request."));
        }
    }
}
