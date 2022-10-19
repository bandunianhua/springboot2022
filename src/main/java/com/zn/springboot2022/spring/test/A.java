package com.zn.springboot2022.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @描述
 * @返回值
 * @创建人 Administrator
 * @创建时间 2022/10/8
 */
@Component
public class A {
    @Lazy
    @Autowired
    private B b;


    @Async
    public void print (){
        System.out.println("b对象："+b);
    }
}
