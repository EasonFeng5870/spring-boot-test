package com.eason.core.spring.boot.pre.container.parent;

import com.eason.core.spring.boot.pre.container.child.ChildComponent;
import com.eason.core.spring.boot.pre.container.child.ChildConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 12:45 2017/11/19
 **/
@Component("childContainer")
public class ChildContainer implements ApplicationContextAware {

    private ApplicationContext parentApplicationContext;

    public void setChildContainer() {
        AnnotationConfigApplicationContext childApplicationContext = new AnnotationConfigApplicationContext(ChildConfiguration.class);
        childApplicationContext.setParent(this.parentApplicationContext);

        ChildContainer childContainer = childApplicationContext.getBean(ChildContainer.class);
        System.out.println(childContainer);

        ChildComponent childComponent = childApplicationContext.getBean(ChildComponent.class);
        childComponent.childApplicationContextTest();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.parentApplicationContext = applicationContext;
    }
}
