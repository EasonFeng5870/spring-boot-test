package com.eason.core.spring.boot.pre.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("get msg:" + msg);
    }

}
