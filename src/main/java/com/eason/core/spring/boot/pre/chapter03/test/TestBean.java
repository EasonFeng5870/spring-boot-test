package com.eason.core.spring.boot.pre.chapter03.test;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 14:08 2017/11/19
 **/
public class TestBean {

    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
