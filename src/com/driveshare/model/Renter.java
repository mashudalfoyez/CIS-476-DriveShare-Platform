package com.driveshare.model;

import com.driveshare.pattern.Observer;

// class for represent and helps to implements
// rents car and user info and receiec notifications
public class Renter implements Observer {
    private String name;

    // constuctor
    public Renter(String name) {
        this.name = name;
    }

    @Override
    // simply for calling when car updates
    public void update(Car car) {
        System.out.println(name + " notified: " + car.getModel() +
                " new price = " + car.getThe_price());
    }
}