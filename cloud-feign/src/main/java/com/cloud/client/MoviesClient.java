package com.cloud.client;

import com.cloud.hystrix.IndexClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ouyang on 2019/4/24.
 * cloud-producer-movices
 */
@FeignClient(value = "CLOUD-PRODUCER")
//@FeignClient(name = "CLOUD-PRODUCER-MOVICES",fallback = IndexClientHystrix.class)
public interface MoviesClient {

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String list() ;


}
