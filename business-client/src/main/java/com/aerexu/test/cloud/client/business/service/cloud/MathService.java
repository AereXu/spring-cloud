package com.aerexu.test.cloud.client.business.service.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 16:59
 * @version: 1.0.0
 */
@FeignClient("service-client")
public interface MathService extends MathCompute {
}
