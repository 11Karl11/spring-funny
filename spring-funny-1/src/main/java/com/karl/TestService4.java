package com.karl;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author karl xie
 */
// @Component
public class TestService4 {

    private User user;

    public TestService4() {
        System.out.println("无参构造");
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
        System.out.println("set 注入");
    }
}