package com.eason.core.spring.boot.pre.service;

import com.eason.core.spring.boot.pre.aop.AopAction;
import org.springframework.stereotype.Service;

/**
 *
 * @author fengyingsheng on 2017/11/14.
 */
@Service("DemoAnnotationService")
public class DemoAnnotationService {

    @AopAction(name="注解拦截的DemoAnnotationService.add操作")
    public void add(){
        System.out.println("this is a add method call.");
    }

}
