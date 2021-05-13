package com.karl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author karl xie
 */
@Aspect
@Component
public class KarlAspect {

    @Before("execution(public void com.karl.service.AService.test())")
    public void karlBefore(){
        System.out.println("aop功能");
    }
}