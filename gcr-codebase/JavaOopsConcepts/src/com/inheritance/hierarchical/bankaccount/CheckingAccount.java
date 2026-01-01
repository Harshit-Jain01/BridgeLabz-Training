package com.inheritance.hierarchical.bankaccount;

public class CheckingAccount extends BankAccount{
	
	private double withdrawalLimit;

	public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}
	
	public void displayAccountType(){
		super.displayAccountType();
		System.out.println("Your withdrawl limit is "+withdrawalLimit);	 
	}
	
}
