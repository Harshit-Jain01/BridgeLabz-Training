package com.day8.financetracker;

import java.util.Map;

public class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(int year, double income, double limit,
                        Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("Annual Report: " + year);
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Annual budget exceeded!");
        } else {
            System.out.println("Annual spending within limit");
        }
    }
}
