package com.redteamobile.scloudb.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.redteamobile.scloud.CheckSignResp;
import com.redteamobile.scloudb.model.page.ResponseStruct;
import com.redteamobile.scloudb.model.req.UserParam;
import com.redteamobile.scloudb.service.CheckSignService;
import com.redteamobile.scloudb.service.ComputeClient;
import com.redteamobile.scloudb.service.ComputeService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yoruichi on 17/4/25.
 */
@RestController
public class ConsumerController extends BaseController {

    @Autowired
    private CheckSignService checkSignService;
    @Autowired
    private ComputeService computeService;
    @Autowired
    private ComputeClient client;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.add();
    }

    @RequestMapping(value = "/addFeign", method = RequestMethod.GET)
    public String addFeign() {
        return client.add(10, 10);
    }

    @RequestMapping(value = "/test/json", method = RequestMethod.GET)
    public ResponseStruct testJson() {
        return computeService.testJson();
    }

    @RequestMapping(value = "/feign/test/json", method = RequestMethod.GET)
    public ResponseStruct testJsonFeign() {
        UserParam user = new UserParam();
        user.setName("Feign");
        return client.testJson(user, System.currentTimeMillis() + "");
    }

    @RequestMapping(value = "/rpc/checkSign/{merchantCode}", method = RequestMethod.POST)
    public ResponseStruct checkSign(@ApiParam(required = true) @PathVariable String merchantCode,
            @ApiParam(required = true,
                    value = "{\"metadata\":\n{\"signType\":\"SHA1\",\n\"timestamp\":,\n\"accessKey\":\"\"},\n\"content\":{\"status\":\"\",\n\"type\":1}}")
            @RequestBody JsonNode body,
            @RequestHeader("signature") String sign) {
        logger.info("Receive request body {} with sign {} from merchant {}", body.toString(), sign, merchantCode);
        try {
            CheckSignResp resp = checkSignService.checkSign(merchantCode, sign, body);
            if (resp.getSuccess()) {
                return succ(sign);
            } else {
                return failedWithMsg(resp.getExcept());
            }
        } catch (Exception e) {
            logger.error("", e);
            return failedWithMsg("Network failed.");
        }
    }
}
