package com.day1.functionalinterface.predicate;

import java.util.function.Predicate;

public class BankWithdrawal {
    public static void main(String[] args) {

        double balance = 50000;

        Predicate<Double> validWithdrawal =
                amount -> amount > 0 && amount <= balance;

        double withdrawAmount = 20000;

        System.out.println(
            validWithdrawal.test(withdrawAmount)
            ? "Withdrawal allowed"
            : "Invalid withdrawal amount"
        );
    }
}