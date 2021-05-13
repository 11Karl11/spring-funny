package com.karl;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

/**
 * @author karl xie
 */
public class ApplicationContextTest {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        applicationContext.registerBeanDefinition("user",beanDefinition);

        applicationContext.refresh();
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);


        System.out.println(applicationContext.getEnvironment().getSystemEnvironment());
        System.out.println(applicationContext.getEnvironment().getSystemProperties());


        Resource resource = applicationContext.getResource("spring.xml");
        System.out.println(resource);
        File file = resource.getFile();
        System.out.println(file.getPath());

        //国际化
        // applicationContext.getMessage("test",null, Locale.CHINESE);



    }
}