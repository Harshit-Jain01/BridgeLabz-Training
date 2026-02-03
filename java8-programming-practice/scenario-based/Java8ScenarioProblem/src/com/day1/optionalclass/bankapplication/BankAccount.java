package com.day1.optionalclass.bankapplication;

public class BankAccount {

    int accountNo;
    String accountHolderName;
    String nominee;
    Double balance;
    String loanDetails;
    String transactionRefNo;
    String creditCard;

    public BankAccount(int accountNo, String accountHolderName,
                       String nominee, Double balance,
                       String loanDetails, String transactionRefNo,
                       String creditCard) {

        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.nominee = nominee;
        this.balance = balance;
        this.loanDetails = loanDetails;
        this.transactionRefNo = transactionRefNo;
        this.creditCard = creditCard;
    }
}
