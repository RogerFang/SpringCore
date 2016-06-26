package com.roger.spring.core;

import com.roger.spring.core.component.Dessert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Roger on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class AutowiredAmbiguityTest {
    /**
     * 当一个借口存在多个实现时，自动装配会存在歧义
     * 解决方法:
     * 1、只能使用一个@Primary注解在具体的实现类上
     * 2、使用限定符@Qualifier进行限定, 设置的参数就是bean的限定符, 默认所有的bean都有一个限定符与beanID相同,
     *    也可以在bean声明上添加@Qualifier注解设置自定义的限定符
     */
    @Autowired
    @Qualifier("iceCream")
    private Dessert dessert;

    @Test
    public void test(){
        dessert.eat();
    }
}
