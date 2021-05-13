package com.karl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author karl xie
 */
// @Component
public class TestService5 implements InitializingBean {

    private User user;

    public TestService5() {
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

    @Override
    public void afterPropertiesSet() throws Exception {
        //验证this
        System.out.println("初始化");
    }
}