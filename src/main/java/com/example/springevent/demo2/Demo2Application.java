package com.example.springevent.demo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 自定义事件 Demo2Event 继承 ApplicationEvent
 * 实现对指定类型事件进行监听
 * */

@SpringBootApplication
public class Demo2Application implements ApplicationRunner{
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        applicationEventPublisher.publishEvent(new Demo2Event(this));
    }

}
