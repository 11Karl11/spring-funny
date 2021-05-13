package com.karl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * @author karl xie
 */
// @Component
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Class<?> clazz = bean.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Test.class)){
                Test test = field.getAnnotation(Test.class);
                String value = test.value();
                field.setAccessible(true);
                try {
                    field.set(bean,value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }


        return bean;
    }
}