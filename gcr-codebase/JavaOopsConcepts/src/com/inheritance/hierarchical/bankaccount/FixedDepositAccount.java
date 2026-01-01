package com.inheritance.hierarchical.bankaccount;

public class FixedDepositAccount extends BankAccount {
	
	private int months;

	public FixedDepositAccount(String accountNumber, double balance, int months) {
		super(accountNumber, balance);
		this.months = months;
	}
	public void displayAccountType(){
		super.displayAccountType();
		System.out.println("Time period of F.D is "+months);	 
	}

}
