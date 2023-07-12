package com.example.springevent.demo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 事件驱动基础使用 ApplicationEventPublisher ApplicationEvent ApplicationListener
 * ApplicationEventPublisher 子类 ApplicationContext
 * 事件源、监听器 需要被spring管理
 * 监听器 需要实现 ApplicationListener<ApplicationEvent> 接口
 * 可体现事件源和监听器之间的松耦合 仅依赖Spring、ApplicationEvent
 * */

@SpringBootApplication
public class Demo1Application implements ApplicationRunner{
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        applicationEventPublisher.publishEvent(new ApplicationEvent(this){});
    }

}
