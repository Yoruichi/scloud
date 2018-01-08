package com.redteamobile.scloudb.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.redteamobile.scloud.CheckSignReq;
import com.redteamobile.scloud.CheckSignResp;
import com.redteamobile.scloud.MerchantServGrpc;
import com.redteamobile.scloudb.pool.ChannelPool;
import com.redteamobile.scloudb.pool.ChannelPoolWithEurekaFactory;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yoruichi on 17/12/28.
 */
@Service
public class CheckSignService {

    @Autowired
    @Qualifier("COMPUTE-SERVICE")
    private ChannelPoolWithEurekaFactory factory;

    @HystrixCommand(fallbackMethod = "fallBack",
            commandProperties = @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"))
    public CheckSignResp checkSign(String merchantCode, String sign, JsonNode body)
            throws Exception {
        CheckSignReq request = CheckSignReq.newBuilder()
                .setMerchantCode(merchantCode)
                .setRequestId(body.get("metadata").get("timestamp").asText())
                .setBody(body.toString())
                .setAccessKey(body.get("metadata").get("accessKey").asText())
                .setTimestamp(body.get("metadata").get("timestamp").asLong())
                .setSignType(body.get("metadata").get("signType").asText())
                .setSign(sign)
                .build();
        ManagedChannel channel = null;
        ChannelPool pool = factory.makePool();
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

    public CheckSignResp fallBack(String merchantCode, String sign, JsonNode body) {
        return CheckSignResp.newBuilder().setSuccess(false).setMessage("Network error.").build();
    }
}
