package com.eason.core.spring.boot.pre.chapter03.combinAnnotation;

import org.springframework.stereotype.Service;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:54 2017/11/19
 **/
@Service
public class CombinAnnotationBean {

    public void test(){
        System.out.println("使用组合注解获取bean信息");
    }
}
