package com.roger.spring.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Roger on 2016/6/26.
 */
@Aspect
public class AudienceAspect {

    @Pointcut("execution(* com.roger.spring.core.aspect.Performance.perform(..))")
    public void performance(){
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Take you seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demand a refund");
    }

    @After("performance()")
    public void after(){
        System.out.println("After");
    }

    @Around("performance()")
    public void watchPerfomance(ProceedingJoinPoint jp){
        try {
            System.out.println("Around before!");
            jp.proceed();
            System.out.println("Around after returning!");
        } catch (Throwable throwable) {
            System.out.println("Around after throwing!");
        }
    }
}
