package com.day1.functionalinterface.supplier;


import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        // 1. Generate OTP using Supplier
        Supplier<Integer> otpSupplier = () ->
                100000 + new Random().nextInt(900000);
        System.out.println("Generated OTP: " + otpSupplier.get());

        // 2. Generate random student ID using Supplier
        Supplier<String> studentIdSupplier = () ->
                "STU" + (1000 + new Random().nextInt(9000));
        System.out.println("Student ID: " + studentIdSupplier.get());

        // 3. Provide current date and time using Supplier
        Supplier<LocalDateTime> dateTimeSupplier =
                LocalDateTime::now;
        System.out.println("Current Date & Time: " + dateTimeSupplier.get());

        // 4. Provide default welcome message using Supplier
        Supplier<String> welcomeMessageSupplier = () ->
                "Welcome to the Application!";
        System.out.println("Welcome Message: " + welcomeMessageSupplier.get());

        // 5. Generate random discount coupon using Supplier
        Supplier<String> couponSupplier = () ->
                "SAVE" + (10 + new Random().nextInt(90));
        System.out.println("Discount Coupon: " + couponSupplier.get());
    }
}
