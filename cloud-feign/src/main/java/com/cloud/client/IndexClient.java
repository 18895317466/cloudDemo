package com.cloud.client;

import com.cloud.hystrix.IndexClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ouyang on 2019/4/24.
 */
//@FeignClient(value = "CLOUD-PRODUCER")
@FeignClient(name = "CLOUD-PRODUCER",fallback = IndexClientHystrix.class)
public interface IndexClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}
