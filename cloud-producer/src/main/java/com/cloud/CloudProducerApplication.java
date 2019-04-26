package com.cloud;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableEurekaClient 表明自己是个生产者
 */
@SpringBootApplication
@ComponentScan
@EnableEurekaClient
@EnableFeignClients
public class CloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplication.class, args);
    }

}
