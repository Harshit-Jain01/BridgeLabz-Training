package com.day5.loanapprovalautomation;

public class UseLoanClass{

    public static void main(String[] args) {

        Applicant applicant1 =
                new Applicant("Amit Sharma", 720, 60000, 500000);

        Applicant applicant2 =
                new Applicant("Neha Verma", 630, 35000, 300000);

        LoanApplication homeLoan =
                new HomeLoan(applicant1, 240, 7.5);

        LoanApplication personalLoan =
                new PersonalLoan(applicant2, 60, 12.0);

        homeLoan.approveLoan();
        personalLoan.approveLoan();

        System.out.println("Home Loan Status: " + homeLoan.getLoanStatus());
        System.out.println("Home Loan EMI: " + homeLoan.calculateEMI());

        System.out.println("Personal Loan Status: " + personalLoan.getLoanStatus());
        System.out.println("Personal Loan EMI: " + personalLoan.calculateEMI());
    }
}
