package com.karl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author karl xie
 */
@Component
public class TestService6 implements TestInterface {

    private User user;

    public TestService6() {
        System.out.println("无参构造");
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
        System.out.println("set 注入");
    }

    @PostConstruct
    public void xxx(){
        System.out.println("xxxxxxx");
    }

    // @Override
    // public void afterPropertiesSet() throws Exception {
    //     //验证this
    //     System.out.println("初始化");
    // }

    @Override
    public void test() {
        System.out.println("业务逻辑");
    }
}