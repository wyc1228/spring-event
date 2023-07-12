package com.example.springevent.demo2;

import org.springframework.context.ApplicationEvent;

public class Demo2Event extends ApplicationEvent {

    public Demo2Event(Object source){
        super(source);
    }

    @Override
    public String toString(){
        return "Demo2Event{" +
                "message='" + source + '}';
    }
}
