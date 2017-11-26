package com.eason.core.spring.boot.pre.chapter02.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author fengyingsheng on 2017/11/15.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean getDevDemoBean() {
        return new DemoBean("this is a dev env bean.");
    }

    @Bean
    @Profile("prod")
    public DemoBean getProdDemoBean() {
        return new DemoBean("this is a prod env bean.");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
