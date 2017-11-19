package com.eason.core.spring.boot.pre.chapter03.pool;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:20 2017/11/19
 **/
@Configuration
@ComponentScan("com.eason.core.spring.boot.pre.chapter03.pool")
@EnableAsync
@EnableAspectJAutoProxy
public class AsyncConfig implements AsyncConfigurer {

    @Nullable
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(25);
        executor.initialize();
        return executor;
    }

    @Nullable
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {

        return null;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AsyncService asyncService = context.getBean(AsyncService.class);
        for(int i=0; i<10; i++) {
            asyncService.executeAsyncTask(i);
            asyncService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
