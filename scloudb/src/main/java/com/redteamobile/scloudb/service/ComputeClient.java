package com.redteamobile.scloudb.service;

import com.redteamobile.scloudb.model.page.ResponseStruct;
import com.redteamobile.scloudb.model.req.UserParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yoruichi on 17/4/26.
 */
@FeignClient(value = "COMPUTE-SERVICE", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(value = "/compute/add", method = RequestMethod.GET)
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @RequestMapping(value = "/compute/test/json", method = RequestMethod.POST, consumes = "application/json")
    ResponseStruct testJson(@RequestBody UserParam user, @RequestHeader(value = "tokenId") String tokenId);
}
