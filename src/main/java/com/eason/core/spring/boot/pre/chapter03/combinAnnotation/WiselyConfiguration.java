package com.eason.core.spring.boot.pre.chapter03.combinAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:52 2017/11/19
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan()
public @interface WiselyConfiguration {

    String[] value() default {};
}
