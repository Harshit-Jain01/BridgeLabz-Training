package com.day1.optionalclass.bankapplication;


import java.util.Optional;

public class OptionalBankingDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                101,
                "Amit Kumar",
                null,            
                null,            
                "Car Loan",
                null,            
                "MasterCard Gold"
        );

        // 1. Bank account may not have nominee
        String nominee = Optional.ofNullable(account.nominee)
                .orElse("Nominee not assigned");
        System.out.println("Nominee: " + nominee);

        // 2. Fetch loan details if available
        Optional.ofNullable(account.loanDetails)
                .ifPresent(l -> System.out.println("Loan Details: " + l));

        // 3. If balance is null, return minimum balance
        double balance = Optional.ofNullable(account.balance)
                .orElse(1000.0);
        System.out.println("Account Balance: " + balance);

        // 4. Safely fetch transaction reference number
        String txnRef = Optional.ofNullable(account.transactionRefNo)
                .orElse("Transaction reference not available");
        System.out.println("Transaction Ref No: " + txnRef);

        // 5. Display credit card details only if present
        Optional.ofNullable(account.creditCard)
                .ifPresent(c -> System.out.println("Credit Card: " + c));
    }
}
