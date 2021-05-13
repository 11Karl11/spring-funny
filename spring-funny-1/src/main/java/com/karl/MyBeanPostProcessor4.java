package com.karl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @author karl xie
 */
// @Component
public class MyBeanPostProcessor4 implements InstantiationAwareBeanPostProcessor {


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (beanName.equals("testService5")){
            System.out.println("实例化之后");
            //自己操作对象
        }
        //这里false的话就不会走spring的set注入
        return true;
    }
}