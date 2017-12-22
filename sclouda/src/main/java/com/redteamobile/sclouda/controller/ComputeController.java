package com.redteamobile.sclouda.controller;

import com.redteamobile.sclouda.model.page.ResponseStruct;
import com.redteamobile.sclouda.model.req.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yoruichi on 17/4/25.
 */
@RestController
@RequestMapping("/compute")
public class ComputeController extends BaseController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("compute-service");
        logger.info("/add, host:{},port:{},server:{},do {}+{} return {}", serviceInstance.getHost(),
                serviceInstance.getPort(),
                serviceInstance.getServiceId(), a, b, a + b);
        return a + b;
    }

    @RequestMapping(value = "/test/json", method = RequestMethod.POST)
    public ResponseStruct testJson(HttpServletRequest request, @RequestBody UserParam user) {
        logger.info("request received from host {} and server {} with parameter user {}", user);
        String headerParam = request.getHeader("tokenId");
        user.setToken(headerParam);
        return succ(user);
    }
}
