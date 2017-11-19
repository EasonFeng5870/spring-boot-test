package com.eason.core.spring.boot.pre.chapter03.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 14:11 2017/11/19
 **/
@ActiveProfiles("prod")
@ContextConfiguration(classes = {TestConfigure.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class Main {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String actual = testBean.getContent();
        Assert.assertEquals(actual, "prod");
    }
}
