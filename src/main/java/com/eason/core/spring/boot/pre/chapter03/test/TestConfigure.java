package com.eason.core.spring.boot.pre.chapter03.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 14:09 2017/11/19
 **/
@Configuration
public class TestConfigure {

    @Bean
    @Profile("dev")
    public TestBean getDevBean() {
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean getProdBean() {
        return new TestBean("prod");
    }

}
