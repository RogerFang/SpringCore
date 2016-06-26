package com.roger.spring.core;

import com.roger.spring.core.valueinject.PropertyPlaceholder;
import com.roger.spring.core.valueinject.PropertySpEL;
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
public class ValueInjectTest {

    @Autowired
    private PropertyPlaceholder propertyPlaceholder;

    @Autowired
    private PropertySpEL propertySpEL;

    @Test
    public void testPropertyPlaceholder(){
        System.out.println(propertyPlaceholder.getTitle());
    }

    @Test
    public void testPropertySpEL(){
        System.out.println(propertySpEL.getTitle());
    }
}
