package com.driveshare.model;

import java.util.ArrayList;
import java.util.List;
import com.driveshare.pattern.Observer;

// car class for rentabel vehicle and subject in observer pattern
public class Car {
    private String model;
    private double the_price;

    private List<Observer> observers = new ArrayList<>(); // list of observers

    // constructor
    public Car(String model, double the_price) {
        this.model = model;
        this.the_price = the_price;
    }

    // add
    public void add_Observer(Observer o) {
        observers.add(o);
    }
    // set price
    public void setThe_price(double the_price) {
        this.the_price = the_price;
        notifyObservers();
    }
    // notify
    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
    // get model
    public String getModel() {
        return model;
    }
    // get price
    public double getThe_price() {
        return the_price;
    }
}