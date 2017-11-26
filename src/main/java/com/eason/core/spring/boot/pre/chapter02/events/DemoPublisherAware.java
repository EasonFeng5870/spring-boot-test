package com.eason.core.spring.boot.pre.chapter02.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 10:34 2017/11/26
 **/
@Component("demoPublisherAware")
public class DemoPublisherAware implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(String msg) {
        this.applicationEventPublisher.publishEvent(new DemoEvent(this, msg));
    }
}
