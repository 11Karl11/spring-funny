package com.karl;

import org.springframework.stereotype.Component;

/**
 * @author karl xie
 */
@Component
public class UserService {


    @Test("hhhh")
    private String name;

    public String getName() {
        return name;
    }


    // @Autowired
    // private User user;

}