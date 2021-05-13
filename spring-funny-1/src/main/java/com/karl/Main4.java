package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main4 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestService4 testService = annotationConfigApplicationContext.getBean("testService4", TestService4.class);
        System.out.println(testService);
    }
}