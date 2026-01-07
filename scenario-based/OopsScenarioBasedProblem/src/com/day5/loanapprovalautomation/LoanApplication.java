package com.day5.loanapprovalautomation;

public abstract class LoanApplication implements IApprovable {
    protected Applicant applicant;
    protected int term;
    protected double interestRate;
    private String loanStatus;

    protected LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    protected double calculateBaseEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    protected abstract boolean isEligible();
}
