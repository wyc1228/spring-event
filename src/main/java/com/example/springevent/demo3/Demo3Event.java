package com.example.springevent.demo3;

import org.springframework.context.ApplicationEvent;

public class Demo3Event extends ApplicationEvent {

    private String orderId;

    public Demo3Event(Object source,String orderId){
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString(){
        return "Demo2Event{" +
                "orderId='" + orderId + '}';
    }
}
