package com.karl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 *
 * 加了lazy的原理如下:
 * 1. A的创建: A a=new A();
 * 2. 属性注入:发现需要B,查询字段b的所有注解,发现有@lazy注解,那么就不直接创建B了,而是使用动态代理创建一个代理类B
 * 3. 此时A跟B就不是相互依赖了,变成了A依赖一个代理类B1,B依赖A
 * @author karl xie
 */
@Service
public class AService {

    // @Autowired
    private BService bService;

    @Lazy
    public AService(BService bService) {
        this.bService = bService;
    }

    // @Autowired
    // private CService cService;

    public void test(){
        System.out.println(bService);
    }
}