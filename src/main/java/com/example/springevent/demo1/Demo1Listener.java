package com.example.springevent.demo1;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Demo1Listener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent args){
        System.out.println("Demo1Listener: " + args.toString());
    }

}
