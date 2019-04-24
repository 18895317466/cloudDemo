package com.cloud.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ouyang on 2019/4/24.
 */
@Service
public class IndexService {

    @Autowired
    RestTemplate restTemplate;


    public String hiError(String name){
        return "hey"+",there is some problem with hi page";
    }


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name)
    {
//        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
        Object forObject = restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, Object.class);
        return forObject.toString();
    }

}
