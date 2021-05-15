package com.karl.service;

import com.karl.dao.OrderMapper;
import com.karl.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author karl xie
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private OrderMapper orderMapper;

    public void test() {
        System.out.println(userMapper.selectById(1));

        System.out.println(orderMapper.selectById(1));
    }

}