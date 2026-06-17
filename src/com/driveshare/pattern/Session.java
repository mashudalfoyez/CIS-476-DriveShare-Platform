package com.driveshare.pattern;

import com.driveshare.model.User;

// class for manager current user session
//
public class Session {
    private static Session instance_Time;
    private User currentUser;

    private Session() {}

    // get single
    public static Session getInstance_Time() {
        if (instance_Time == null) {
            instance_Time = new Session();
        }
        return instance_Time;
    }
    // login user
    public void login(User user) {
        currentUser = user;
        System.out.println("User logged in: " + user.getEmail());
    }
}