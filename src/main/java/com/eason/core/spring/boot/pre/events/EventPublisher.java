package com.eason.core.spring.boot.pre.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author eason feng
 */
@Component("EventPublisher")
public class EventPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(String msg){
        this.applicationContext.publishEvent(new DemoEvent(this, msg));
    }

}
