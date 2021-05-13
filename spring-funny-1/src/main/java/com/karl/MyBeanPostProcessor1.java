package com.karl;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @author karl xie
 */
// @Component
public class MyBeanPostProcessor1 implements InstantiationAwareBeanPostProcessor {

    // @Override
    // public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
    //     if (beanName.equals("testService1")) {
    //         System.out.println("实例化前");
    //         return new Object();
    //     }
    //     return null;
    // }
}