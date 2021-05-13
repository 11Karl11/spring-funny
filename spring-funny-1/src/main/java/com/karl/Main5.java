package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main5 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestService5 testService = annotationConfigApplicationContext.getBean("testService5", TestService5.class);
        System.out.println(testService);
    }
}