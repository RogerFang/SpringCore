package com.roger.spring.core.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 利用AOP实现引入功能
 * 还没弄清楚！
 *
 * Created by Roger on 2016/6/26.
 */
@Aspect
public class EncoreableInroducerAspect {

    @DeclareParents(value = "com.roger.spring.core.aspect.Performance",
        defaultImpl = DefaultEncoreable.class)
    private Encoreable encoreable;
}
