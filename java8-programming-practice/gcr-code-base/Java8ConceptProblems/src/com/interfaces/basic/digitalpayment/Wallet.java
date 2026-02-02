package com.interfaces.basic.digitalpayment;

public class Wallet implements PaymentProcessor {
    private String walletType;

    // constructor
    public Wallet(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public void pay(double amount) {
        System.out.println(walletType + " Wallet -> Rs." + amount + " deducted successfully");
    }
}