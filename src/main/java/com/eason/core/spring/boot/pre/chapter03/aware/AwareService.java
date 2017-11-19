package com.eason.core.spring.boot.pre.chapter03.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 11:37 2017/11/19
 **/
@Service("awareService")
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("this bean name is :" + this.beanName);
        Resource resource = this.resourceLoader.getResource("classpath:com/eason/core/spring/boot/pre/chapter03/aware/a.txt");
        try{
            System.out.println("Get Resource info:" + IOUtils.toString(resource.getInputStream()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
