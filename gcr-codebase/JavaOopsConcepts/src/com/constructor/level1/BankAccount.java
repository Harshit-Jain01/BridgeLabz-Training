package com.constructor.level1;

class BankAccount {

    
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // access balance
    public double getBalance() {
        return balance;
    }

    // modify balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
}
