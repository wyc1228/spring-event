package com.example.springevent.demo4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

/**
 * @EventListener 用法讲解
 * 监听自定义事件
 * 注解中指定监听事件类型，可指定多个监听事件类型
 * 注解中使用condition 指定符合条件的事件才进行监听
 * 根据特定条件进行监听 对事件进行修改后返回
 * */

@SpringBootApplication
public class Demo4Application implements ApplicationRunner{
    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        applicationEventPublisher.publishEvent(new Demo4Event("order-001"));
        applicationEventPublisher.publishEvent(new Demo4Event("order-001"));
    }

}
