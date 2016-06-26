package com.roger.spring.core;

import com.roger.spring.core.scope.BeanModel1;
import com.roger.spring.core.scope.BeanModel2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Roger on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class ScopeTest {

    @Autowired
    private BeanModel1 model1;

    @Autowired
    private BeanModel2 model2;

    @Test
    public void testSingleton(){
        System.out.println("singleton多次注入同一个实例");
        System.out.println("singleton:" + model1.getSingleton());
        System.out.println("singleton:" + model2.getSingleton());
    }

    @Test
    public void testPrototype(){
        System.out.println("prototype多次注入创建新实例");
        System.out.println("prototype:" + model1.getPrototype());
        System.out.println("prototype:" + model2.getPrototype());
    }

    /**
     * 在web应用中，利用proxyMode设置代理模式来解决
     * 将会话或请求作用域的bean注入到单例bean
     *
     * 基于接口代理: ScopedProxyMode.INTERFACE ,
     * 基于类代理(使用CGLIB): ScopedProxyMode.TARGET_CLASS
     *
     * xml配置中使用<aop:scoped-proxy/>
     */

    @Test
    public void testSession(){

    }
}
