package com.aerexu.test.cloud.server.zuul.config;

import com.aerexu.test.cloud.server.zuul.filter.JwtFilter;
import com.aerexu.test.cloud.server.zuul.filter.TestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/2/20 19:21
 * @version: 1.0.0
 */
@Configuration
public class FilterConfig {
    @Bean
    public TestFilter testFilter(){
        return new TestFilter();
    }

    @Bean
    public JwtFilter jwtFilter(){
        return new JwtFilter();
    }
}
