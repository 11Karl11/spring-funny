package com.karl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author karl xie
 */
@Service
public class BService {

    // @Autowired
    private AService aService;

    public BService(AService aService) {
        this.aService = aService;
    }

    public void test(){
        System.out.println(aService);
    }
}