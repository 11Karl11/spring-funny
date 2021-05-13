package com.karl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author karl xie
 */
// @Service
public class CService {

    @Autowired
    private AService aService;

    public void test(){
        System.out.println(aService);
    }
}