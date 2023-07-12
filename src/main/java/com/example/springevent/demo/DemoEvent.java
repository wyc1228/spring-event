package com.example.springevent.demo;

public class DemoEvent {
    private String message;

    public DemoEvent(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return "DemoEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
