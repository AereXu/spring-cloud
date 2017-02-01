package com.aerexu.test.cloud.client.business.service.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 16:37
 * @version: 1.0.0
 */
public interface MathCompute {
    @RequestMapping(path = "add", method = RequestMethod.GET)
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
