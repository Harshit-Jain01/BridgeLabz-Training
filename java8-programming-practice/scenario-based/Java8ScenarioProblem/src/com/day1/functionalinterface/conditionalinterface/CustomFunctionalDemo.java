package com.day1.functionalinterface.conditionalinterface;


@FunctionalInterface
interface BonusCalculator {
    double calculate(double salary);
}

@FunctionalInterface
interface LoanEligibility {
    boolean check(double salary);
}

@FunctionalInterface
interface TaxCalculator {
    double calculateTax(double income);
}

@FunctionalInterface
interface LoginValidator {
    boolean validate(String username, String password);
}

public class CustomFunctionalDemo {

    public static void main(String[] args) {

        // 1. Calculate bonus using custom functional interface
        BonusCalculator bonus = salary -> salary * 0.10;
        System.out.println("Bonus Amount: " + bonus.calculate(50000));

        // 2. Check loan eligibility using custom functional interface
        LoanEligibility loanEligibility = salary -> salary >= 30000;
        System.out.println("Loan Eligible: " + loanEligibility.check(45000));

        // 3. Calculate tax using custom functional interface
        TaxCalculator tax = income -> income * 0.05;
        System.out.println("Tax Amount: " + tax.calculateTax(60000));

        // 4. Validate user login using custom functional interface
        LoginValidator login = (username, password) ->
                username.equals("admin") && password.equals("admin123");
        System.out.println("Login Successful: " + login.validate("admin", "admin123"));
    }
}
