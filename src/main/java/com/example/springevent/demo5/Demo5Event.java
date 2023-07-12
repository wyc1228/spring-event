package com.example.springevent.demo5;

import org.springframework.context.ApplicationEvent;

public class Demo5Event extends ApplicationEvent {

    private String orderId;

    public Demo5Event(String orderId){
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
