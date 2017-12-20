package com.redteamobile.scloudb.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.redteamobile.scloudb.model.page.ResponseStruct;
import com.redteamobile.scloudb.model.req.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yoruichi on 17/4/26.
 */
@Service
public class ComputeService {
    @Autowired RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String add() {
        return restTemplate
                .getForEntity("http://COMPUTE-SERVICE/compute/add?a=10&b=20", String.class)
                .getBody();
    }

    public String fallBack() {
        return "Service error";
    }

    @HystrixCommand(fallbackMethod = "testJsonFallBack")
    public ResponseStruct testJson() {
        UserParam user = new UserParam();
        user.setName("John");
        return restTemplate
                .postForEntity("http://COMPUTE-SERVICE/compute/test/json", user,
                        ResponseStruct.class)
                .getBody();
    }

    public ResponseStruct testJsonFallBack() {
        return new ResponseStruct().setSuccess(false);
    }
}
