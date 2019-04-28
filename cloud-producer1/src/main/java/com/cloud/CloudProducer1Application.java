package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @EnableEurekaClient 表明自己是个生产者
 */
@EnableEurekaClient
@ComponentScan("com.cloud")
@SpringBootApplication
public class CloudProducer1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudProducer1Application.class, args);
	}

}
