package com.inheritance.hierarchical.bankaccount;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void displayAccountType(){
		super.displayAccountType();
		 System.out.println("Account Type: SavingAccount");
		 System.out.println("Interest rate is "+interestRate);
		 
	}

}
