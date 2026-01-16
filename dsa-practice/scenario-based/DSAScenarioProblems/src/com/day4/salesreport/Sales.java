package com.day4.salesreport;

class Sales{
    String date;
    double amount;
    int transactionId;

    Sales(String date, double amount, int transactionId) {
        this.date = date;
        this.amount = amount;
        this.transactionId = transactionId;
    }
}
