package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 *  @EnableHystrix  开启断路器
 *  Netflix开源了Hystrix组件，实现了断路器模式，SpringCloud对这一组件进行了整合。
 *  在微服务架构中，一个请求需要调用多个服务是非常常见的
 *  较底层的服务如果出现故障，会导致连锁故障。当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开
 *  断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class CloudRobbinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRobbinApplication.class, args);
	}


}
