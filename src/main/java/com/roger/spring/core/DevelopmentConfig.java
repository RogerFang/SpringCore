package com.roger.spring.core;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by Roger on 2016/6/26.
 */
@Configuration
@Profile("dev")
public class DevelopmentConfig {

    /**
     * @Bean默认情况下，bean的ID和其注解的方法名一样
     *
     * dev
     * 采用druid数据源
     *
     * @return
     */
    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(20);
        dataSource.setMaxActive(30);

        System.out.println("Profile dev: duridDataSource");
        return dataSource;
    }
}
