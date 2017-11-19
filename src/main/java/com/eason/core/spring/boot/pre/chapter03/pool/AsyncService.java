package com.eason.core.spring.boot.pre.chapter03.pool;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:17 2017/11/19
 **/
@Component
public class AsyncService {

    @PostConstruct
    public void init(){
        System.out.println(1);
    }

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务executeAsyncTask:" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务executeAsyncTaskPlus+1：" + (i + 1));
    }

}
