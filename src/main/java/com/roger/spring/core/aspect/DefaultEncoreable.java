package com.roger.spring.core.aspect;

/**
 * Created by Roger on 2016/6/26.
 */
public class DefaultEncoreable implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("Encore");
    }
}
