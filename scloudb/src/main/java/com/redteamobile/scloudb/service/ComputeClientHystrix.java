package com.redteamobile.scloudb.service;

import com.redteamobile.scloudb.model.page.ResponseStruct;
import com.redteamobile.scloudb.model.req.UserParam;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yoruichi on 17/4/26.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "Service error.";
    }

    @Override
    public ResponseStruct testJson(@RequestBody UserParam user, @RequestHeader(value = "tokenId") String tokenId) {
        return new ResponseStruct().setSuccess(false);
    }

}
