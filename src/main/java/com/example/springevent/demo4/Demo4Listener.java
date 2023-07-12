package com.example.springevent.demo4;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Demo4Listener {

    @EventListener
    public void listener1(Demo4Event args){
        System.out.println("Demo1Listener: " + args.toString());
    }

    /**
     * 注解中指定监听事件类型，可指定多个监听事件类型
     * 方法参数可使用Object作为形参，但只能有一个形参
     * */
    @EventListener({Demo4Event.class, ApplicationEvent.class})
    public void listener2(Demo4Event args){
        System.out.println("Demo1Listener: " + args.toString());
    }

    /**
     * 根据特定条件触发监听事件
     * */
    @EventListener(condition = "#args.orderId == '123'")
    public void listener3(Demo4Event args){
        System.out.println("Demo1Listener: " + args.toString());
    }

}
