package com.zn.springboot2022.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @描述
 * @返回值
 * @创建人 Administrator
 * @创建时间 2022/10/11
 */
@Aspect
@Component
public class UserAspect {

//    @Pointcut("@annotation(包名.类名)")

    @Pointcut("execution(public * com.zn.springboot2022.spring.test.A.print())")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){

        System.out.println("方法前置处理");
    }

}
