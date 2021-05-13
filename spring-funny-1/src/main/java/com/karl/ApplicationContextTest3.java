package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class ApplicationContextTest3 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService);
        System.out.println(userService.getName());

    }
}