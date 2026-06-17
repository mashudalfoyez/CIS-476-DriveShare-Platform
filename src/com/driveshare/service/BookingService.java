package com.driveshare.service;

// In here booksing services simply works on handeling booking operations
// and it stores booking and checks for any overlapping
import com.driveshare.model.*;
import java.util.*;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>(); // list of all booking

    // our method
    public boolean book_theCar(Car car, String start, String end) {

        // usin loop for checking thoru
        for (Booking b : bookings) {
            if (b.getCar() == car) {
                if (start.compareTo(b.getEnd()) < 0 &&
                        end.compareTo(b.getStart()) > 0) {

                    System.out.println("Booking failed (overlap)");
                    return false;
                }
            }
        }

        // simply crearke and prints
        bookings.add(new Booking(car, start, end));
        System.out.println(("Booking success: " + car.getModel()) + " from" + start + " to " + end);
        return true;
    }
}