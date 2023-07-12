package com.example.springevent.demo4;

import org.springframework.context.ApplicationEvent;

public class Demo4Event extends ApplicationEvent {

    private String orderId;

    public Demo4Event(String orderId){
        super(orderId);
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
