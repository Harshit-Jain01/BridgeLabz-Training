package com.day9.payxpress;

import java.time.LocalDate;

class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println("Internet Bill Alert: Service will be suspended after " + dueDate);
        }
    }
}
