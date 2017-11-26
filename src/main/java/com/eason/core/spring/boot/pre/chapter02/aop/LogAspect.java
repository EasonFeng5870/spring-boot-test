package com.eason.core.spring.boot.pre.chapter02.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author fengyingsheng on 2017/11/14.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.eason.core.spring.boot.pre.chapter02.aop.AopAction)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction aopAction = method.getAnnotation(AopAction.class);
        System.out.println("注解式拦截：" + aopAction.name());
        System.out.println(joinPoint.getTarget());
        System.out.println("==========");
    }

    @Before("execution(* com.eason.core.spring.boot.pre.chapter02.aop.service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }

}
