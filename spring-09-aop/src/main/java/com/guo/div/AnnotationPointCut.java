package com.guo.div;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.guo.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("===================before methods===================================");
    }

    @After("execution(* com.guo.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===================after methods===================================");
    }

    //在增强环绕中，我们可以给定一个参数，代表我们要去获取切入的点
    @Around("execution(* com.guo.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("==========before around===========");
        Object proceed = pjp.proceed();
        System.out.println("==========after around===========");
    }
}
