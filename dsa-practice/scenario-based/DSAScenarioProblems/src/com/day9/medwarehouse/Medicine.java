package com.day9.medwarehouse;

import java.time.LocalDate;

public class Medicine {

    int id;
    String name;
    LocalDate expiryDate;

    public Medicine(int id, String name, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Expiry: " + expiryDate;
    }
}
