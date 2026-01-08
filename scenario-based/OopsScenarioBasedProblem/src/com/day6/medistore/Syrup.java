package com.day6.medistore;

import java.time.LocalDate;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isBefore(expiryDate.minusDays(7));
    }
}
