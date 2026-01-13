package com.day8.financetracker;

import java.util.*;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    protected Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction tx) {
        transactions.add(tx);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction tx : transactions) {
            if (tx.getType().equals("EXPENSE")) {
                total += tx.getAmount();
            }
        }
        return total;
    }

    public double calculateNetSavings() {
        return income - getTotalExpenses();
    }
}
