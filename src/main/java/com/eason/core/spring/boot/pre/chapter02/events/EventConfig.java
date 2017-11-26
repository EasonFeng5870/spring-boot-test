package com.eason.core.spring.boot.pre.chapter02.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.chapter02.events")
public class EventConfig  {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EventPublisher publisher = context.getBean(EventPublisher.class);
        publisher.publish("hi, eason. come on.");//同步的发布事件
        System.out.println("===================");
        DemoPublisherAware demoPublisherAware = context.getBean(DemoPublisherAware.class);
        demoPublisherAware.publish("hi, eason. this is another way to publish event.");
    }
}
