package com.roger.spring.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Roger on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@ActiveProfiles("dev")
public class ProfileTest {

    @Test
    public void test(){
        System.out.println("执行后会print-----Profile dev: duridDataSource");
    }
}
