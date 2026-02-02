package com.interfaces.defaultmethods.paymentgateway;

public interface PaymentProcessor {

    void processPayment(double amount, String transactionId);

    // default method - added later for refund support
    default void refund(double amount, String transactionId) {
        System.out.println("Default refund initiated for Rs." + amount +
                " (Transaction: " + transactionId + ")");
        System.out.println("-> Using basic/manual refund process (contact support if needed)");
        System.out.println("Refund status: PENDING (default implementation)");
    }
}