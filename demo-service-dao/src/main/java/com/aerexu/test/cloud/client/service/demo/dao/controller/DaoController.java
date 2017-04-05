package com.aerexu.test.cloud.client.service.demo.dao.controller;


import com.aerexu.test.cloud.client.dao.entity.common.THospitalOn;
import com.aerexu.test.cloud.client.dao.mapper.common.basic.THospitalOnMapper;
import com.aerexu.test.cloud.client.dao.entity.link.THoscodeMatch;
import com.aerexu.test.cloud.client.dao.mapper.link.basic.THoscodeMatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/2/24 13:34
 * @version: 1.0.0
 */
@RestController
@RequestMapping("dao/")
@Transactional
public class DaoController {


    @Autowired
    private THoscodeMatchMapper tHoscodeMatchMapper;

    @Autowired
    private THospitalOnMapper tHospitalOnMapper;

    @RequestMapping("insert/success")
    public boolean insertSuccess() throws InterruptedException {
        Random random = new Random();
        int hospitalId = random.nextInt(100000);
        THoscodeMatch tHoscodeMatch = new THoscodeMatch();
        tHoscodeMatch.setClientCode("CodeA");
        tHoscodeMatch.setClientHosId("ClientHosIdA");
        tHoscodeMatch.setQyHosId(hospitalId);
        tHoscodeMatchMapper.insertSelective(tHoscodeMatch);
        THospitalOn tHospitalOn = new THospitalOn();
        tHospitalOn.setClientId(1111111);
        tHospitalOn.setHospitalId(hospitalId);
        tHospitalOnMapper.insertSelective(tHospitalOn);
        Thread.sleep(1000);
        return true;
    }

    @RequestMapping("insert/fail")
    public boolean insertFail() throws InterruptedException {
        Random random = new Random();
        int hospitalId = random.nextInt(100000);
        THoscodeMatch tHoscodeMatch = new THoscodeMatch();
        tHoscodeMatch.setClientCode("CodeB");
        tHoscodeMatch.setClientHosId("ClientHosIdB");
        tHoscodeMatch.setQyHosId(hospitalId);
        tHoscodeMatchMapper.insertSelective(tHoscodeMatch);
        THospitalOn tHospitalOn = new THospitalOn();
        tHospitalOn.setClientId(1111112);
        tHospitalOn.setHospitalId(hospitalId);
        tHospitalOnMapper.insertSelective(tHospitalOn);
        Thread.sleep(1000);
        throw new RuntimeException("Test transaction!");
    }
}
