package com.example.springevent.demo3;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Demo3Listener {

    @EventListener
    public void onApplicationEvent(Demo3Event args){
        System.out.println("Demo1Listener: " + args.toString());
    }

}
