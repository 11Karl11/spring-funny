package com.karl;

import com.karl.annotation.KarlScan;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author karl xie
 */
@Configuration
@KarlScan("com.karl.dao")
@ComponentScan("com.karl")
public class AppConfig {


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Driver.class.getName());
        dataSource.setUsername("ruhr_new");
        dataSource.setPassword("RUHR@007mysql");
        dataSource.setUrl("jdbc:mysql://192.168.0.104:3307/test");
        return dataSource;
    }




    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }
}