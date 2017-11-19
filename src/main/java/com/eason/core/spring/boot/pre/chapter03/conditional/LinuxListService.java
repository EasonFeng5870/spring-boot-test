package com.eason.core.spring.boot.pre.chapter03.conditional;

/**
 * @author eason.feng
 * @Description:
 * @Date Created in 13:46 2017/11/19
 **/
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
