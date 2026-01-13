package com.day8.financetracker;

import java.time.LocalDate;

public class Transaction {

    private double amount;
    private String type;     
    private LocalDate date;
    private String category;

    public Transaction(double amount, String type, LocalDate date, String category) {

        if (!type.equalsIgnoreCase("INCOME") && !type.equalsIgnoreCase("EXPENSE")) {
            throw new IllegalArgumentException("Transaction type must be INCOME or EXPENSE");
        }

        this.amount = amount;
        this.type = type.toUpperCase();
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }
}
