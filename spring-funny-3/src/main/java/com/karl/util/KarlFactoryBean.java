package com.karl.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author karl xie
 */
public class KarlFactoryBean implements FactoryBean {


    private Class mapper;

    private SqlSession sqlSession;

    public KarlFactoryBean(Class mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addMapper(mapper);
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {

        // //jdk动态代理，mybatis代理对象
        // Object o = Proxy.newProxyInstance(KarlFactoryBean.class.getClassLoader(), new Class[]{mapper}, new InvocationHandler() {
        //     @Override
        //     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //         if (Object.class.equals(method.getDeclaringClass())) {
        //             return method.invoke(this, args);
        //         }
        //         System.out.println(method.getName());
        //         return null;
        //     }
        // });
        // return o;

        return sqlSession.getMapper(mapper);
    }

    @Override
    public Class<?> getObjectType() {
        return mapper;
    }
}