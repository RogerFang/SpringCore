package com.roger.spring.core;

import com.roger.spring.core.aspect.AudienceAspect;
import com.roger.spring.core.aspect.EncoreableInroducerAspect;
import com.roger.spring.core.aspect.TrackCounterAspect;
import com.roger.spring.core.dao.DaoMarker;
import com.roger.spring.core.service.ServiceMarker;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Roger on 2016/6/26.
 */
@Configuration
// 扫描包
// @ComponentScan(basePackages = {"com.roger.spring.core.service"})
// 根据类来扫描该类所在的包
@ComponentScan(basePackageClasses = {ServiceMarker.class, DaoMarker.class},
        basePackages = {"com.roger.spring.core.component",
                "com.roger.spring.core.scope",
                "com.roger.spring.core.valueinject",
                "com.roger.spring.core.aspect"})

// 使用@Import组合配置类
@Import(value = {DevelopmentConfig.class, ProduceConfig.class})
// 使用@ImportResource组合xml配置
// @ImportResource("classpath: xxx-config.xml")

@PropertySource(value = "classpath:test.properties", name = "testProperties")
//启用AspectJ自动代理 xml中使用"<aop:aspectj-autoproxy/>"
@EnableAspectJAutoProxy
public class ApplicationConfig {

    // 激活Profile的多种方式, 设置参数spring.profiles.active, 默认spring.profiles.default
    // 1、设置DipatcherServlet <init-param>参数"spring.profiles.default"(激活多个profile时用逗号隔开)
    // 2、设置Web应用上下文参数, 在web.xml中设置<context-param>参数"spring.profiles.default"
    // 3、在集成测试类使用@ActiveProfiles注解设置


    /**
     * 开启属性占位符${...}
     *
     * @return
     */
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public AudienceAspect audienceAspect(){
        return new AudienceAspect();
    }

    @Bean
    public TrackCounterAspect trackCounterAspect(){
        return new TrackCounterAspect();
    }

    @Bean
    public EncoreableInroducerAspect encoreableInroducerAspect(){
        return new EncoreableInroducerAspect();
    }
}
