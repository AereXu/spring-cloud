package com.aerexu.test.cloud.client.business.controller;

import com.aerexu.test.cloud.client.business.service.cloud.DaoOperation;
import com.aerexu.test.cloud.client.business.service.cloud.MathCompute;
import com.aerexu.test.cloud.client.business.service.cloud.StringOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 16:42
 * @version: 1.0.0
 */
@RestController
public class TestController{

    @Autowired
    private MathCompute mathService;

    @Autowired
    private StringOperation stringOperation;

    @Autowired
    private DaoOperation daoOperation;

    @RequestMapping(path = "test/add", method = RequestMethod.GET)
    public Integer add() {
        return mathService.add(1, 2);
    }

    @RequestMapping(path = "test/concat", method = RequestMethod.GET)
    public String concat() {
        return stringOperation.concat("ab", "dc");
    }

    @RequestMapping(path = "test/dao/insert/{status}")
    public boolean daoOperation(@PathVariable String status) {
        if (status.equals("success")) {
            return daoOperation.insertSuccess();
        } else {
            return daoOperation.insertFail();
        }
    }

}
