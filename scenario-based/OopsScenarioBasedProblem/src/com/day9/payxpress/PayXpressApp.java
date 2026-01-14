package com.day9.payxpress;

import java.time.LocalDate;

public class PayXpressApp {

    public static void main(String[] args) {

        Bill electricity = new ElectricityBill(1200, LocalDate.of(2026, 1, 20));
        Bill water = new WaterBill(450, LocalDate.of(2026, 1, 18));
        Bill internet = new InternetBill(999, LocalDate.of(2026, 1, 15));

        // Polymorphic reminders
        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();

        System.out.println();

        electricity.pay();
        electricity.pay(); 

        System.out.println();

        double lateAmount = internet.calculateLateFee(100);
        System.out.println("Internet bill with late fee: " + lateAmount);
    }
}
