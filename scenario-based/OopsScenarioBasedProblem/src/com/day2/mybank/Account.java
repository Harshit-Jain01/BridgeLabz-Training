package com.day2.mybank;


public abstract class Account implements ITransaction {

    private String accountNumber;
    private double balance;

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Encapsulated balance modification
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Protected access for subclasses
    protected double getBalanceForInterest() {
        return balance;
    }

    // Polymorphic behavior
    public abstract double calculateInterest();
}
