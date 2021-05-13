package com.karl;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author karl xie
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        //beanFactory bean工厂--生产bean

        //beanFactory 容器, 存储着 对象/beanDefinition
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerSingleton("user",new User());
        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);
    }
}