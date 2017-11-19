package com.eason.core.spring.boot.pre.container.parent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 12:44 2017/11/19
 **/
@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.container.parent")
public class ParentContainer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentContainer.class);
        ChildContainer childContainer = context.getBean(ChildContainer.class);
        childContainer.setChildContainer();
    }


}
