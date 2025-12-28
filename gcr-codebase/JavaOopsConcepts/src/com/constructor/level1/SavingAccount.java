package com.constructor.level1;

class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);  
        System.out.println("Balance: " + getBalance());          
        System.out.println("Interest Rate: " + interestRate);
    }
}
