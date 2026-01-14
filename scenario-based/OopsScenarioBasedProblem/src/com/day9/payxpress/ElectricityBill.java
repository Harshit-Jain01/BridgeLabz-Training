package com.day9.payxpress;

import java.time.LocalDate;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Electricity Bill Reminder: Please pay before " + dueDate);
        }
    }
}
