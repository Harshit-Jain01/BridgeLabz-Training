package com.day8.financetracker;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BudgetApp {

    public static void main(String[] args) {

        Map<String, Double> categoryLimits = new HashMap<>();
        categoryLimits.put("Food", 5000.0);
        categoryLimits.put("Travel", 3000.0);

        Budget budget = new MonthlyBudget("January",30000,20000,categoryLimits); 
        budget.addTransaction(new Transaction(
                2000, "EXPENSE", LocalDate.now(), "Food"));

        budget.addTransaction(new Transaction(
                4500, "EXPENSE", LocalDate.now(), "Travel"));

        budget.generateReport();
        budget.detectOverspend();
    }
}
