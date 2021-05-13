package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        TestService1 testService1 = annotationConfigApplicationContext.getBean("testService1", TestService1.class);
        System.out.println(testService1);
    }
}