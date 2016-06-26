package com.roger.spring.core.component;

import org.springframework.stereotype.Component;

/**
 * Created by Roger on 2016/6/26.
 */
@Component
public class Cake implements Dessert {
    @Override
    public void eat() {
        System.out.println("eat Cake");
    }
}
