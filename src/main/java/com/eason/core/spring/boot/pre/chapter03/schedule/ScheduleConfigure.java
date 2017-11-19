package com.eason.core.spring.boot.pre.chapter03.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:34 2017/11/19
 **/
@ComponentScan("com.eason.core.spring.boot.pre.chapter03.schedule")
@Configuration
@EnableScheduling
public class ScheduleConfigure {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfigure.class);

    }

}
