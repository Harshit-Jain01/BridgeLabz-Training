package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.03;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Current Account Loan Approved: ₹" + amount);
        } else {
            System.out.println("Current Account Loan Rejected");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount;
    }
}

