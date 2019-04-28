package com.cloud.config.ziDingYi;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ouyang on 2019/4/28.
 *
 * 该类为 ribbon 的配置类
 * 该类不应该在主应用程勋的 @ComponentScan所扫描的包中
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        //负载均衡规则改为随机
        return  new RandomRule();
    }

}
