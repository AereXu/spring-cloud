package com.aerexu.test.cloud.client.business;

import com.aerexu.test.cloud.client.business.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @task:
 * @discrption:
 * @author: AereXu
 * @date: 2017/2/1 16:25
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.aerexu.test.cloud.client.business.service.cloud",
        defaultConfiguration = FeignConfig.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
