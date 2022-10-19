package com.zn.springboot2022.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @描述
 * @返回值
 * @创建人 Administrator
 * @创建时间 2022/10/11
 */
@ComponentScan("com.zn.springboot2022")
@EnableAspectJAutoProxy
@EnableAsync
public class AppConfig {

//    @Bean
//    public OrderService orderService1(){
//        return new OrderService();
//    }
//
//    @Bean
//    public OrderService orderService2(){
//        return new OrderService();
//    }
}
