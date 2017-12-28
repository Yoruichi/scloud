package com.redteamobile.scloudb.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.redteamobile.scloud.CheckSignReq;
import com.redteamobile.scloud.CheckSignResp;
import com.redteamobile.scloud.MerchantServGrpc;
import com.redteamobile.scloudb.pool.ChannelPool;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yoruichi on 17/12/28.
 */
@Service
public class CheckSignService {

    @Autowired
    private ChannelPool pool;

    public CheckSignResp checkSign(String merchantCode, String sign, JsonNode body)
            throws Exception {
        CheckSignReq request = CheckSignReq.newBuilder()
                .setMerchantCode(merchantCode)
                .setRequestId(body.get("metadata").get("timestamp").asText())
                .setBody(body.asText())
                .setAccessKey(body.get("metadata").get("accessKey").asText())
                .setTimestamp(body.get("metadata").get("timestamp").asLong())
                .setSignType(body.get("metadata").get("signType").asText())
                .setSign(sign)
                .build();
        ManagedChannel channel = null;
        try {
            channel = pool.borrowObject();
            MerchantServGrpc.MerchantServBlockingStub stub =
                    MerchantServGrpc.newBlockingStub(channel);
            CheckSignResp resp = stub.checkSign(request);
            return resp;
        } finally {
            if (channel != null)
                pool.returnObject(channel);
        }
    }
}
