package com.aerexu.test.cloud.client.service.controller;

import com.aerexu.test.cloud.core.service.serviceclient.MathCompute;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 15:33
 * @version: 1.0.0
 */
@RestController
public class MathController implements MathCompute {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
