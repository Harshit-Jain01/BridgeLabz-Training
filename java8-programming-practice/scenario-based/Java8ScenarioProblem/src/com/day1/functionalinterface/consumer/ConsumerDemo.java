package com.day1.functionalinterface.consumer;


import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        // 1. Print student details using Consumer
        Consumer<String> printStudentDetails =
                student -> System.out.println("Student Details: " + student);
        printStudentDetails.accept("Name: Rahul, Roll: 101, Marks: 85");

        // 2. Log employee login activity using Consumer
        Consumer<String> logEmployeeLogin =
                emp -> System.out.println("Login Log: Employee " + emp + " logged in successfully");
        logEmployeeLogin.accept("EMP102");

        // 3. Print order confirmation message using Consumer
        Consumer<String> orderConfirmation =
                orderId -> System.out.println("Order " + orderId + " confirmed successfully");
        orderConfirmation.accept("ORD5678");

        // 4. Display account balance using Consumer
        Consumer<Double> displayBalance =
                balance -> System.out.println("Account Balance: ₹" + balance);
        displayBalance.accept(25000.50);

        // 5. Send notification message using Consumer
        Consumer<String> sendNotification =
                message -> System.out.println("Notification Sent: " + message);
        sendNotification.accept("Your payment was successful");
    }
}
