package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main7 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        User7 user7 = annotationConfigApplicationContext.getBean("user7",User7.class);
        System.out.println(user7);
    }
}