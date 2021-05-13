package com.karl;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author karl xie
 */
@Component
public class MyFactoryBean implements FactoryBean {


    public Object getObject() throws Exception {
        return new Person();
    }


    public Class<?> getObjectType() {
        return Person.class;
    }
}