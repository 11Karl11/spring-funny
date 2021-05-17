package com.spring;

/**
 * @author karl xie
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}