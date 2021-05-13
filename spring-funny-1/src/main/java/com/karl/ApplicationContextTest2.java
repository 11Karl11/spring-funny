package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author karl xie
 */
public class ApplicationContextTest2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("user"));
        System.out.println("-------------------------");
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(
                "E:\\learning\\boot_2021\\component\\spring-funny\\src\\main\\resources\\spring.xml");
        System.out.println(fileSystemXmlApplicationContext.getBean("user"));
        System.out.println("--------------------------");

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(annotationConfigApplicationContext.getBean("user"));
    }
}