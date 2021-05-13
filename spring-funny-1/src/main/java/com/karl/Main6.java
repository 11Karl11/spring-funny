package com.karl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Main6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        // TestService6 testService = annotationConfigApplicationContext.getBean("testService6", TestService6.class);
        TestInterface testService = (TestInterface) annotationConfigApplicationContext.getBean("testService6");
        testService.test();
        //打印为null，toString方法返回null
        System.out.println(testService);
    }
}