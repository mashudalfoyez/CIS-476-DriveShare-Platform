package com.driveshare.pattern;

import com.driveshare.model.Car;

// class for bulding car pattern for crearkign car objects
//
public class CarBuilder {
    private String model;
    private double price;

    // set car model
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }
    // ser car price
    public CarBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    // finally call to build
    public Car build() {
        System.out.println("Car created: " + model + " | Price: $" + price);
        return new Car(model, price);
    }

}