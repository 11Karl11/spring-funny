package com.karl;

import com.karl.service.AService;
import com.karl.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AService aService = applicationContext.getBean("AService", AService.class);
        BService bService = applicationContext.getBean("BService", BService.class);
        aService.test();
    }
}