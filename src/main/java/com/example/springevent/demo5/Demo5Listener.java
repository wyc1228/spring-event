package com.example.springevent.demo5;


import cn.hutool.core.thread.ThreadUtil;
import com.example.springevent.demo4.Demo4Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Demo5Listener {

    @Async
    @Order(1)
    @EventListener
    public void listener1(Demo4Event args){
        System.out.println("Demo1Listener: " + args.toString());
        ThreadUtil.sleep(2000);
    }

    @Async
    @Order(2)
    @EventListener({Demo4Event.class, ApplicationEvent.class})
    public void listener2(Demo4Event args){
        System.out.println("Demo1Listener: " + args.toString());
        ThreadUtil.sleep(2000);
    }

}
