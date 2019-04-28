package com.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.manger.UserInfoService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "produce " + name + ", port:" + port;
    }

    @RequestMapping("/list")
    public String list() {
        return JSONObject.toJSONString(userInfoService.list());
    }

}
