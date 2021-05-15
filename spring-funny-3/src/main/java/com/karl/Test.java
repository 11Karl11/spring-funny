package com.karl;

import com.karl.dao.UserMapper;
import com.karl.entity.User;
import com.karl.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author karl xie
 */
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // User user = applicationContext.getBean("user", User.class);
        // UserMapper userMapper = applicationContext.getBean("karlFactoryBean", UserMapper.class);
        // System.out.println(userMapper);
        // System.out.println(applicationContext.getBean("&karlFactoryBean"));
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.test();
    }
}