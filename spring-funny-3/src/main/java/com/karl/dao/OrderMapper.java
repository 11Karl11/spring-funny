package com.karl.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author karl xie
 */
public interface OrderMapper {

    @Select("select 'order'")
    String selectById(int id);
}