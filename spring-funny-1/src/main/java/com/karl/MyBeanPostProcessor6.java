package com.karl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author karl xie
 */
@Component
public class MyBeanPostProcessor6 implements InstantiationAwareBeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("testService6")) {
            System.out.println("初始化前");
        }

        // for (Method method : bean.getClass().getMethods()) {
        //     if (method.isAnnotationPresent(PostConstruct.class)){
        //         try {
        //             method.invoke(bean);
        //         } catch (IllegalAccessException e) {
        //             e.printStackTrace();
        //         } catch (InvocationTargetException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // }

        //如果返回null的话，PostConstruct注解不会执行
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (beanName.equals("testService6")) {
            System.out.println("初始化后");


            Object o = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println(method.getName());
                    System.out.println("代理逻辑1");
                     method.invoke(bean,args);
                    System.out.println("代理逻辑2");
                    return null;
                }
            });
            return o;
        }
        return null;
    }
}