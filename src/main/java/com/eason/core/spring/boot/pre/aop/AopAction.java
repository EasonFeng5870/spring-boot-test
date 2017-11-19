package com.eason.core.spring.boot.pre.aop;

import java.lang.annotation.*;

/**
 * @author fengyingsheng on 2017/11/14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAction {
    String name();
}
