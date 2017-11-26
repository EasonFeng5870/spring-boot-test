package com.eason.core.spring.boot.pre.chapter02.singleton;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@ComponentScan("com.eason.core.spring.boot.pre.chapter02.singleton")
@Configuration
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context);
        SingletonService s1 = (SingletonService)context.getBean("SingletonService");
        SingletonService s2 = (SingletonService)context.getBean("SingletonService");
        System.out.println(s1.equals(s2));
        PrototypeService p1 = (PrototypeService)context.getBean("PrototypeService");
        PrototypeService p2 = (PrototypeService) context.getBean("PrototypeService");
        if(!p1.equals(p2)) {
            System.out.println(p1 + "\n" + p2);
        }
        ApplicationContext context1 = new AnnotationConfigApplicationContext(App.class);
        SingletonService s3 = (SingletonService)context1.getBean("SingletonService");
        System.out.println(s1.equals(s3));
        if(!s1.equals(s3)) {
            System.out.println(s1 + "\n" + s3);
        }
        UseFunctionService useFunctionService = (UseFunctionService)context.getBean("useFunctionService");
        System.out.println(useFunctionService.sayHello("nick"));
    }

    @Bean(name = "useFunctionService", autowire = Autowire.BY_NAME)
    public UseFunctionService getUseFunctionService(){
        return new UseFunctionService();
    }

}
