package com.day5.loanapprovalautomation;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term, double interestRate) {
        super(applicant, term, interestRate);
    }

    @Override
    protected boolean isEligible() {
        return applicant.getCreditScore() >= 650 &&
               applicant.getIncome() >= 30000;
    }

    @Override
    public void approveLoan() {
        setLoanStatus(isEligible() ? "APPROVED" : "REJECTED");
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI();
    }
}
