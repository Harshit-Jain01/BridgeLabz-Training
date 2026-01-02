package com.day1.ewallet;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance; // Encapsulation
    protected List<Transaction> history = new ArrayList<>();

    // Normal wallet
    public Wallet() {
        this.balance = 0;
    }

    // Wallet with referral bonus
    public Wallet(double referralBonus) {
        this.balance = referralBonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : history) {
            t.showTransaction();
        }
    }

    public abstract double getTransferLimit();
}
