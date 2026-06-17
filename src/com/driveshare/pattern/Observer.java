package com.driveshare.pattern;

import com.driveshare.model.Car;

// interface for support the notification system
public interface Observer {
    void update(Car car); // method
}