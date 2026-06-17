package com.driveshare.model;

// user class for present user credinetials and store them.
public class User {
    private String email;
    private String password;

    // constructor
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}