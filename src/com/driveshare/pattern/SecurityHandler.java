package com.driveshare.pattern;

// class for simply helps to handle the security of chain of reponsibilty pattern
// each one shows one secuirty questions
public abstract class SecurityHandler {
    protected SecurityHandler next;

    // set next handler
    public void setNext(SecurityHandler next) {
        this.next = next;
    }

    public abstract boolean check(String answer);
}