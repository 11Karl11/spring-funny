package com.karl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author karl xie
 */
public class Main1 {

    public static void main(String[] args) {




        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 单例  多例
        //单例池 ConcurrentHashMap<beanName obj>  非懒加载的单例bean

        System.out.println(applicationContext.getBean("user", User.class));
        System.out.println(applicationContext.getBean("user", User.class));

        System.out.println(applicationContext.getBean("user1", User.class));
        System.out.println(applicationContext.getBean("user1", User.class));

    }
}