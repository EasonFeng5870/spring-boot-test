package com.eason.core.spring.boot.pre.container.child;

import com.eason.core.spring.boot.pre.container.parent.ChildContainer;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 12:48 2017/11/19
 **/
@Component
public class ChildComponent implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void childApplicationContextTest(){
        ApplicationContext parentApplicationContext = applicationContext.getParent();
        if(parentApplicationContext != null) {
            System.out.println(parentApplicationContext);
            ChildContainer childContainer = parentApplicationContext.getBean(ChildContainer.class);
            System.out.println(childContainer.toString());
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
