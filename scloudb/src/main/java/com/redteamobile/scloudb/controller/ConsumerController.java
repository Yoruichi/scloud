package com.redteamobile.scloudb.controller;

import com.redteamobile.scloudb.model.page.ResponseStruct;
import com.redteamobile.scloudb.model.req.UserParam;
import com.redteamobile.scloudb.service.ComputeClient;
import com.redteamobile.scloudb.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yoruichi on 17/4/25.
 */
@RestController
public class ConsumerController extends BaseController {

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
        return client.add(10,10);
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
}
