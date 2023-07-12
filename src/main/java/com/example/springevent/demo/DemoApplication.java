package com.example.springevent.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner{
    public static void main(String[] args) {
             SpringApplication.run(DemoApplication.class, args);
        }

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args){
        applicationContext.publishEvent(new DemoEvent("Hello World!"));
    }

    @EventListener
    public void onApplicationEvent(DemoEvent event){
        System.out.println("event: " + event.toString());
    }

}
