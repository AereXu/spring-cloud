package com.aerexu.test.cloud.server.zipkin.config;

import com.aerexu.test.cloud.core.jdbc.DataSourceProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/3/1 13:19
 * @version: 1.0.0
 */
@Configuration
public class DbConfig {

    public static final String NAME = "datasource";
    public static final String PREFIX = "spring." + NAME;

    @Bean
    @ConfigurationProperties(prefix = PREFIX)
    public DataSourceProperties zipkinDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource zipkinDataSource(DataSourceProperties properties) throws ClassNotFoundException {
        return properties.generateDatasource();
    }
}
