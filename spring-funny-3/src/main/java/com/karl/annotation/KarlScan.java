package com.karl.annotation;

import com.karl.util.KarlBeanDefinitionRegistry;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author karl xie
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(KarlBeanDefinitionRegistry.class) //和KarlScan注解关联  importingClassMetadata中可以获取KarlScan的值
public @interface KarlScan {

    String value() default "";
}