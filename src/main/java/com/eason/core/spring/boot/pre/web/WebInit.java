package com.eason.core.spring.boot.pre.web;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author fengyingsheng on 2017/11/15.
 */
public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.default", "dev");
    }
}
