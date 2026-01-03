package com.day2.mybank;


import java.util.Scanner;

public class UseBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type (Savings / Current): ");
        String type = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter opening balance: ");
        double openingBalance = sc.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();

        Account account;

        if (type.equalsIgnoreCase("Savings")) {
            account = new SavingAccount(accountNumber, openingBalance, interestRate);
        } else {
            account = new CurrentAccount(accountNumber, openingBalance, interestRate);
        }

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Final Balance: " + account.checkBalance());
        System.out.println("Calculated Interest: " + account.calculateInterest());

        sc.close();
    }
}
