package com.karl.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author karl xie
 */
@Component
public class KarlBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("初始化前");
        if (beanName.equals("userService")) {
            ((UserService) bean).setName("hi karl");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("初始化后");
        //是否要aop todo 研究源码
        if (beanName.equals("userService")) {
            //aop的实现
            Object instance = Proxy.newProxyInstance(KarlBeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("代理逻辑");//找切点
                    return method.invoke(bean, args);
                }
            });
            return instance;
        }
        return bean;
    }
}