package com.eason.core.spring.boot.pre.chapter02.aop;

import com.eason.core.spring.boot.pre.chapter02.aop.service.DemoAnnotationService;
import com.eason.core.spring.boot.pre.chapter02.aop.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fengyingsheng on 2017/11/15.
 */
@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.chapter02.aop")
@EnableAspectJAutoProxy
public class AopConfig {
    /**
     * AOP ：切点（PointCut，拦截的类和方法），切面（Aspect，拦截后执行的方法），连接点（Joint Point，对拦截的方法执行切面的功能）。
     *
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = applicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = applicationContext.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
    }

}
