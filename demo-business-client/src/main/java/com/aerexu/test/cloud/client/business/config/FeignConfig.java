package com.aerexu.test.cloud.client.business.config;

import com.aerexu.test.cloud.core.annotation.EnableFeignCustom;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/2/21 10:58
 * @version: 1.0.0
 */
@Configuration
@EnableFeignCustom
public class FeignConfig {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }

}
