package com.interfaces.basic.digitalpayment;

public class Upi implements PaymentProcessor {
    private String upiId;

    // constructor
    public Upi(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment (" + upiId + ") -> Rs." + amount + " paid successfully via UPI");
    }
}