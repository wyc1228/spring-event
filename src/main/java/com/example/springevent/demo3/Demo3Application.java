package com.example.springevent.demo3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;

/**
 * 自定义事件 Demo3Event 添加业务参数
 * 忽略事件源，根据实际业务情况而定，减少参数
 * 使用@EventListener 替换 implements ApplicationListener<Demo3Event> 增加监听者对可扩展性
 * */

@SpringBootApplication
public class Demo3Application implements ApplicationRunner{
    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        String orderId = "order-001";
        applicationEventPublisher.publishEvent(new Demo3Event(this,orderId));
    }

}
