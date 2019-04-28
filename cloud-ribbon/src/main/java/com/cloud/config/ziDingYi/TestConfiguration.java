package com.cloud.config.ziDingYi;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ouyang on 2019/4/28.
 *
 * RibbonClient 为特定的name 的ribbon client 自定义配置
 *
 */
@Configuration
@RibbonClient(name = "CLOUD-PRODUCER",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
