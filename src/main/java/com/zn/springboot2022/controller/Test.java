package com.zn.springboot2022.controller;


import com.zn.springboot2022.spring.AppConfig;
import com.zn.springboot2022.spring.test.A;
import com.zn.springboot2022.spring.test.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @描述
 * @返回值
 * @创建人 Administrator
 * @创建时间 2022/8/11
 */
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService userService = (UserService) context.getBean("userService");
//        userService.test();

//        System.out.println((OrderService) context.getBean("orderService"));
//        System.out.println((OrderService) context.getBean("orderService1"));
//        System.out.println((OrderService) context.getBean("orderService2"));

        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");
        a.print();
        System.out.println(1);
    }

    public void print() {

    }

}
