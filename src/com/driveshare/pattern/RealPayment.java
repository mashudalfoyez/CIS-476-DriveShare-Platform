package com.driveshare.pattern;

// simply class helps to real paymetn system
public class RealPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount);
    }
}