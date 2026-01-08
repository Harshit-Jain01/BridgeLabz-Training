package com.day6.medistore;

import java.time.LocalDate;

public class UseMedicine {

    public static void main(String[] args) {

        Medicine tablet = new Tablet("Paracetamol",5.0,LocalDate.of(2026,5,1));
        Medicine syrup = new Syrup( "Cough Syrup",80.0, LocalDate.of(2026, 1, 20));
               
        Medicine injection = new Injection( "Insulin",150.0,LocalDate.of(2026, 1, 15));
               
        System.out.println("Tablet valid? " + tablet.checkExpiry());
        System.out.println("Syrup valid? " + syrup.checkExpiry());
        System.out.println("Injection valid? " + injection.checkExpiry());

        System.out.println("----------------------------------");

        System.out.println("Tablet bill (5 units): " + tablet.sell(5));
        System.out.println("Syrup bill (2 units): " + syrup.sell(2));

        System.out.println("----------------------------------");

        System.out.println("Tablet stock left: " + tablet.getQuantity());
        System.out.println("Syrup stock left: " + syrup.getQuantity());
    }
}
