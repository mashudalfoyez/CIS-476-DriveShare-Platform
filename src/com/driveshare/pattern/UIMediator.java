package com.driveshare.pattern;

// class for control the communication between UI
public class UIMediator {
    public void notify(String event) {
        System.out.println("Mediator handling: " + event);
    }
}