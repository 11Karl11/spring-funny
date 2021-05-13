package com.karl;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author karl xie
 */
public class Main {

    public static void main(String[] args) {

        User user = new User();

        String name = user.getName();//java bean

        //定义bean的方法

        //声明式----------------
        //<bean/>标签定义bean
        //@Component
        //@Bean
        //---------------------
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user1 = applicationContext.getBean("user", User.class);  //spring生成的对象-->spring bean
        System.out.println(user1);


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        User user2 = annotationConfigApplicationContext.getBean("user", User.class);
        System.out.println(user2);

        //--------------------------------------------------------------------------------------------------------------

        //编程式
        //BeanDefinition
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(User.class);
        annotationConfigApplicationContext.registerBeanDefinition("user1",beanDefinition);
        User user3 = annotationConfigApplicationContext.getBean("user1", User.class);
        System.out.println(user3);


        //实现factoryBean接口
        AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition1.setBeanClass(MyFactoryBean.class);
        annotationConfigApplicationContext.registerBeanDefinition("myFactoryBean",beanDefinition1);
        MyFactoryBean myFactoryBean = annotationConfigApplicationContext.getBean("&myFactoryBean", MyFactoryBean.class);
        Person person = annotationConfigApplicationContext.getBean("myFactoryBean", Person.class);
        System.out.println(myFactoryBean);
        System.out.println(person);



        //Supplier
        // AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext();
        // applicationContext1.registerBean("user",User.class, new Supplier<User>() {
        //     public User get() {
        //         User user = new User();
        //         user.setName("zhangsan");
        //         return user;
        //     }
        // });
        // applicationContext1.refresh();
        // User user = applicationContext1.getBean("user", User.class);
        // System.out.println(user.getName());

    }
}