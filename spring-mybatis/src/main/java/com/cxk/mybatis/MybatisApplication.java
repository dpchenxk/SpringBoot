package com.cxk.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.cxk.mybatis.controller",
        "com.cxk.mybatis.service",
        "com.cxk.mybatis.config"})
public class MybatisApplication {

    public static void main(String [] args){
        SpringApplication.run(MybatisApplication.class,args);
    }

}
