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
        return "error page";
    }


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        // VIP virtual IP
        return restTemplate.getForObject("http://CLOUD-PRODUCER/hi?name=" + name, String.class);

    }

}
