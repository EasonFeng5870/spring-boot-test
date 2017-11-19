package com.eason.core.spring.boot.pre.chapter03.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:36 2017/11/19
 **/
@Service
public class ScheduleTaskService  {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次：" + simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 41 13 ? * *")//每天13点41分执行。
    public void fixTimeExecutation(){
        System.out.println("指定时间执行：" + simpleDateFormat.format(new Date()));
    }
}
