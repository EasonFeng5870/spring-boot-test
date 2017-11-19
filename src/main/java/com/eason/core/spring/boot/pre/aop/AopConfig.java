package com.eason.core.spring.boot.pre.aop;

import com.eason.core.spring.boot.pre.service.DemoAnnotationService;
import com.eason.core.spring.boot.pre.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fengyingsheng on 2017/11/15.
 */
@Configuration
@ComponentScan("com.eason.core.*")
@EnableAspectJAutoProxy
public class AopConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = applicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = applicationContext.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
    }

}
