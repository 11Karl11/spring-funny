package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestService3 testService = annotationConfigApplicationContext.getBean("testService3", TestService3.class);
        System.out.println(testService);
    }
}