package com.day5.loanapprovalautomation;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term, double interestRate) {
        super(applicant, term, interestRate);
    }

    @Override
    protected boolean isEligible() {
        return applicant.getCreditScore() >= 700 &&
               applicant.getIncome() >= 50000;
    }

    @Override
    public void approveLoan() {
        setLoanStatus(isEligible() ? "APPROVED" : "REJECTED");
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI() * 0.95;
    }
}
