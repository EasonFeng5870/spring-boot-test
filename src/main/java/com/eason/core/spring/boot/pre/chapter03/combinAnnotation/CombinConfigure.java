package com.eason.core.spring.boot.pre.chapter03.combinAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:55 2017/11/19
 **/
@WiselyConfiguration("com.eason.core.spring.boot.pre.chapter03.combinAnnotation")
public class CombinConfigure {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CombinConfigure.class);
        CombinAnnotationBean combinAnnotationBean = context.getBean(CombinAnnotationBean.class);
        combinAnnotationBean.test();
    }
}
