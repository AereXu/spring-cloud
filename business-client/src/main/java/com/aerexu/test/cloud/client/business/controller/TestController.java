package com.aerexu.test.cloud.client.business.controller;

import com.aerexu.test.cloud.client.business.service.cloud.MathCompute;
import com.aerexu.test.cloud.client.business.service.cloud.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 16:42
 * @version: 1.0.0
 */
@RestController
public class TestController implements MathCompute{
    @Autowired
    private MathService mathService;

    @RequestMapping(path = "test/add", method = RequestMethod.GET)
    public Integer add(){
        return mathService.add(1,2);
    }

    @Override
    public Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return a+b;
    }
}
