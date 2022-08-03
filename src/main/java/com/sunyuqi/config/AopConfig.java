package com.sunyuqi.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopConfig {

    @Pointcut(value = "execution(* com.sunyuqi.controller.StudentController.* (..))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long starttime=System.currentTimeMillis();
        Object proceed = point.proceed();
        System.out.println("调用时间："+(System.currentTimeMillis()-starttime));
        return proceed;
    }
}
