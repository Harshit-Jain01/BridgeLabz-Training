package com.interfaces.defaultmethods.paymentgateway;

public class RazorPayProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Razorpay -> Payment of Rs." + amount +
                " processed successfully (TxID: " + transactionId + ")");
    }

    @Override
    public void refund(double amount, String transactionId) {
        System.out.println("Razorpay -> Instant refund of Rs." + amount +
                " initiated (TxID: " + transactionId + ")");
        System.out.println("Refund status: PROCESSED via Razorpay API");
    }
}