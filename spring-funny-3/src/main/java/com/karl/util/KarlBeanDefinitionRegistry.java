package com.karl.util;

import com.karl.annotation.KarlScan;
import com.karl.dao.OrderMapper;
import com.karl.dao.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author karl xie
 */
public class KarlBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

        //获取dao的路径
        Map<String, Object> annotationAttributes =
                importingClassMetadata.getAnnotationAttributes(KarlScan.class.getName());
        Object value = annotationAttributes.get("value");
        System.out.println(value);


        KarlMapperScanner karlMapperScanner = new KarlMapperScanner(registry);
        karlMapperScanner.addIncludeFilter(new TypeFilter() {
            @Override
            public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
                //放行所有 待研究源码
                return true;
            }
        });

        int scan = karlMapperScanner.scan(value.toString());
        System.out.println(scan);


    }
}