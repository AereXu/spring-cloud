package com.aerexu.test.cloud.client.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 15:33
 * @version: 1.0.0
 */
@RestController
public class MathController {

    @RequestMapping(path = "add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }
}
