package com.karl.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author karl xie
 */
public interface UserMapper {

    @Select("select 'user'")
    String selectById(int id);
}