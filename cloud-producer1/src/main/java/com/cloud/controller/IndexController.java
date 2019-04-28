package com.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.manger.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by ouyang on 2019/4/24.
 */
@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${server.port}")
    String port;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "produce " + name + ", port:" + port;
    }

    @RequestMapping("/list")
    public String list() {
        return JSONObject.toJSONString(userInfoService.list());
    }

    @GetMapping("user-instance")
    public String showInfo(){
        return JSONObject.toJSONString(this.discoveryClient.getInstances("producer"));
    }

}
