package com.cloud.config.quanJu;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ouyang on 2019/4/29.
 */

@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class RibbonClientDefaultConfigrationTestConfig {
    public static class BazServiceList extends ConfigurationBasedServerList{
        public BazServiceList(IClientConfig config){
            super.initWithNiwsConfig(config);
        }
    }
}
@Configuration
class DefaultRibbonConfig{
    @Bean
    public IRule ribbonRule(){
        return new BestAvailableRule();
    }

    @Bean
    public IPing ribbonPing(){
        return new PingUrl();
    }


    @Bean
    public ServerListSubsetFilter serverListSubsetFilter(){
        ServerListSubsetFilter filter= new ServerListSubsetFilter();
        return filter;
    }

}