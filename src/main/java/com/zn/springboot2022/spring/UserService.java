package com.zn.springboot2022.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @描述
 * @返回值
 * @创建人 Administrator
 * @创建时间 2022/10/10
 */
@Service
public class UserService {

    private OrderService orderService;



        public UserService(OrderService aa){
        this.orderService=aa;
        System.out.println(1);
    }

    public void test(){
        System.out.println(orderService);
    }

    public void afterPropertiesSet() throws Exception {

    }
}
