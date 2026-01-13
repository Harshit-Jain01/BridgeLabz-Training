package com.day8.financetracker;

import java.util.Map;

public class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income, double limit,
                         Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("Monthly Report: " + month);
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Overspending Check (Monthly):");

        for (String category : categoryLimits.keySet()) {
            double spent = 0;

            for (Transaction tx : transactions) {
                if (tx.getCategory().equals(category)
                        && tx.getType().equals("EXPENSE")) {
                    spent += tx.getAmount();
                }
            }

            if (spent > categoryLimits.get(category)) {
                System.out.println(category + " exceeded by " +
                        (spent - categoryLimits.get(category)));
            }
        }
    }
}
