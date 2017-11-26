package com.eason.core.spring.boot.pre.chapter02.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author eason.fengys
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("get msg:" + msg);
    }

}
