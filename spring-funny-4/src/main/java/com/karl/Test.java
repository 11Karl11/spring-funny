package com.karl;

import com.karl.service.UserInterface;
import com.karl.service.UserService;
import com.spring.KarlApplicationContext;

/**
 * @author karl xie
 */
public class Test {

    public static void main(String[] args) {

        KarlApplicationContext applicationContext = new KarlApplicationContext(AppConfig.class);

        UserInterface userInterface = (UserInterface) applicationContext.getBean("userService");
        userInterface.test();
    }
}