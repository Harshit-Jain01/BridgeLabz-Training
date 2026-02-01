package com.streams.gymmembership;

import java.time.LocalDate;

public class GymMember {

    String name;
    LocalDate expiryDate;

    public GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String toString() {
        return name + " expires on " + expiryDate;
    }
}
