package com.day9.payxpress;

import java.time.LocalDate;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid; 

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    public final void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully. Amount: " + amount);
        } else {
            System.out.println(type + " bill is already paid.");
        }
    }

    protected boolean isPaid() {
        return isPaid;
    }

    public abstract void sendReminder();
}
