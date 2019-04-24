package com.cloud.controller;

import com.cloud.client.IndexClient;
import com.cloud.services.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ouyang on 2019/4/24.
 */
@RestController
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);
//    @Autowired
//    private IndexService indexService;
    @Autowired
    private IndexClient indexClient;

//    @RequestMapping(value = "/hi")
//    public String hi(@RequestParam String name)
//    {
//        return indexService.hiService(name);
//    }

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name)
    {
        return indexClient.hi(name);
    }

}
