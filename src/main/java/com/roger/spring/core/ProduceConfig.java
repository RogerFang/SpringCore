package com.roger.spring.core;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by Roger on 2016/6/26.
 */
@Configuration
@Profile("prod")
public class ProduceConfig {

    /**
     * prod
     * 采用dbcp数据源
     *
     * @return
     */
    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(20);
        dataSource.setMaxTotal(40);
        System.out.println("Profile prod: basicDataSource");
        return dataSource;
    }
}
