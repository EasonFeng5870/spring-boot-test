package com.eason.core.spring.boot.pre.chapter02.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author fengyingsheng on 2017/11/15.
 */
@Service("demoMethodService")
public class DemoMethodService {

    public void add() {
        System.out.println("this is demo method service.");
    }
}
