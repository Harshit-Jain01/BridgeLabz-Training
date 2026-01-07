package com.day5.loanapprovalautomation;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term, double interestRate) {
        super(applicant, term, interestRate);
    }

    @Override
    protected boolean isEligible() {
        return applicant.getCreditScore() >= 600;
    }

    @Override
    public void approveLoan() {
        setLoanStatus(isEligible() ? "APPROVED" : "REJECTED");
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI() * 1.05;
    }
}
