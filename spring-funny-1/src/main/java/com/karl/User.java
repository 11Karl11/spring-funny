package com.karl;

import org.springframework.stereotype.Component;

/**
 * @author karl xie
 */
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}