package com.driveshare.pattern;

// simply control access
// adds validation layers
public class PaymentProxy implements Payment {
    private RealPayment real = new RealPayment();

    public void pay(double amount) {
        System.out.println("Checking payment...");
        real.pay(amount);
        System.out.println("Payment successful!");
    }

}