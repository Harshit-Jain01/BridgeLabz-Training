package com.interfaces.basic.digitalpayment;


import java.util.Scanner;

public class UsedigitalPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create different payment methods
        PaymentProcessor upi = new Upi("rames45@upi");
        PaymentProcessor creditCard = new CreditCard("1234567890123456", "Ramesh Rai");
        PaymentProcessor wallet = new Wallet("PhonePay");

        System.out.println("Digital Payment Demo");
        System.out.println("Available payment methods:");
        System.out.println("1 - UPI");
        System.out.println("2 - Credit Card");
        System.out.println("3 - Wallet");
        System.out.print("Choose payment method (1-3): ");

        int choice = input.nextInt();
        System.out.print("Enter amount to pay (Rs.): ");
        double amount = input.nextDouble();

        PaymentProcessor selectedPayment;

        if (choice == 1) {
            selectedPayment = upi;
        } else if (choice == 2) {
            selectedPayment = creditCard;
        } else if (choice == 3) {
            selectedPayment = wallet;
        } else {
            System.out.println("Invalid choice. Payment cancelled.");
            input.close();
            return;
        }

        System.out.println("\nProcessing payment");
        selectedPayment.pay(amount);
        System.out.println("Payment completed successfully!");

        input.close();
    }
}