package com.eason.core.spring.boot.pre.chapter03.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 11:53 2017/11/19
 **/
@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.chapter03.aware")
public class AwareConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }

}
