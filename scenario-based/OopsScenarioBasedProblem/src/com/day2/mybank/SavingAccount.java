package com.day2.mybank;


public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(String accountNumber, double openingBalance, double interestRate) {
        super(accountNumber, openingBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalanceForInterest() * interestRate / 100;
    }
}
