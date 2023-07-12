package com.example.springevent.demo2;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Demo2Listener implements ApplicationListener<Demo2Event> {

    @Override
    public void onApplicationEvent(Demo2Event args){
        System.out.println("Demo1Listener: " + args.toString());
    }

}
