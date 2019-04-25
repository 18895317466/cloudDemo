package com.cloud.hystrix;

import com.cloud.client.IndexClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ouyang on 2019/4/25.
 */
@Component
public class IndexClientHystrix implements IndexClient {

    @Override
    public String hi(String name) {
        return "error page";
    }
}
