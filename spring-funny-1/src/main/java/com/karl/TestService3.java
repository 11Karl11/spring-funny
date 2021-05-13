package com.karl;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author karl xie
 */
// @Component
public class TestService3 {

    private User user;

    public TestService3() {
        System.out.println("无参数构造");
    }

    @Autowired(required = false)
    public TestService3(User user) {
        this.user = user;
        System.out.println("一个参数的构造方法");
    }

    @Autowired(required = false)
    public TestService3(User user, User user2) {
        this.user = user;
        System.out.println("两个参数的构造方法");
    }


}