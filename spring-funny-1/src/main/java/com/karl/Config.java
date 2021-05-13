package com.karl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author karl xie
 */
@ComponentScan("com.karl")
@Import(TestImportBeanDefinitionRegistrar.class)//main7测试要用
public class Config {

    @Bean
    public User user(){
        return new User();
    }
}