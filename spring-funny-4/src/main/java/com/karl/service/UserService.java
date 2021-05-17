package com.karl.service;

import com.spring.Autowired;
import com.spring.Component;
import com.spring.InitializingBean;

/**
 * @author karl xie
 */
// @Scope("prototype")
@Component("userService")
// public class UserService implements BeanNameAware {
// public class UserService implements InitializingBean {
public class UserService implements UserInterface {

    @Autowired
    private OrderService orderService;

    private String beanName;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println(orderService);
        System.out.println(beanName);
        System.out.println(name);
    }

    // @Override
    // public void setBeanName(String name) {
    //     beanName = name;
    // }

    // @Override
    // public void afterPropertiesSet() throws Exception {
    //
    //     System.out.println("初始化");
    //
    // }
}