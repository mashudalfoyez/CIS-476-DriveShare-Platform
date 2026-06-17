package com.driveshare.model;

// class for simply help to reserveation of a car.
// and it stores the car and the dates and attrubutes
public class Booking {
    private Car car;
    private String start;
    private String end;

    // our constructor
    public Booking(Car car, String start, String end) {
        this.car = car;
        this.start = start;
        this.end = end;
    }

    // get start date
    public Car getCar() { return car; }
    public String getStart() { return start; }// get end date
    public String getEnd() { return end; } // car
}