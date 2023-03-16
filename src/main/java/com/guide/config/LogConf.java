package com.guide.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @CreateTime 2023/3/15-15 15:34
 * @Author wangchunran
 * @Description
 */
@Lazy(false)
@Component
public class LogConf extends SpringApplication {


    @Autowired
    public LogConf(){
        setLogStartupInfo(false);
    }

    @Override
    public void setLogStartupInfo(boolean logStartupInfo) {
        super.setLogStartupInfo(false);
    }
}
