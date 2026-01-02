package com.day1.ewallet;

import java.time.LocalDateTime;

public class Transaction {
    private String fromUser;
    private String toUser;
    private double amount;
    private LocalDateTime time;

    public Transaction(String from, String to, double amount) {
        this.fromUser = from;
        this.toUser = to;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public void showTransaction() {
        System.out.println(fromUser + " → " + toUser +
                " | Amount: ₹" + amount + " | " + time);
    }
}
