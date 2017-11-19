package com.eason.core.spring.boot.pre.chapter03.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:47 2017/11/19
 **/
@Configuration
public class ConditionalConfigure {

    @Bean
    @Conditional(WindowsConditional.class)
    public ListService getWindowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxConditional.class)
    public ListService getLinuxListService(){
        return new LinuxListService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfigure.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "环境下的列表的命令：" + listService.showListCmd());
    }

}
