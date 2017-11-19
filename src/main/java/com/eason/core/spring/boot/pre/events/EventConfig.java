package com.eason.core.spring.boot.pre.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.events")
public class EventConfig  {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EventPublisher publisher = context.getBean(EventPublisher.class);
        publisher.publish("hi, eason. come on.");
    }
}
