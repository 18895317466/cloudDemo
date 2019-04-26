package com.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ouyang on 2019/4/26.
 */
@Configuration
public class RestTemplateConfiguration {

    /**
     *@LoadBalanced, 用于加入 Ribbon 配置
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
