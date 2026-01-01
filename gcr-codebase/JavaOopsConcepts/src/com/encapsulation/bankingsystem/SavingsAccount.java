package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable  {
	
	private static final double intRate=0.02;
	
	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		
	}

	@Override
	public void applyForLoan(double amount) {
		 if (calculateLoanEligibility(amount)) {
	            System.out.println("Savings Account Loan Approved: ₹" + amount);
	        } else {
	            System.out.println("Savings Account Loan Rejected");
	        }
	}

	@Override
	public boolean calculateLoanEligibility(double amount) {
		if(getBalance()>=amount*0.5)
		return true;
		return false;
	}

	@Override
	public double calculateInterest() {
		
		return getBalance()*intRate ;
	}
	 
	
	
	
	
	
}
