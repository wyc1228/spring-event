package com.example.springevent.demo5;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 异步监听
 * 使用@Order 注解指定监听顺序
 * 使用@Async 注解实现异步监听
 * */
@EnableAsync
@SpringBootApplication
public class Demo5Application implements ApplicationRunner{
    public static void main(String[] args) {
        SpringApplication.run(Demo5Application.class, args);
    }

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        applicationEventPublisher.publishEvent(new Demo5Event("order-001"));

        System.out.println("发布事件完成");
    }

}
