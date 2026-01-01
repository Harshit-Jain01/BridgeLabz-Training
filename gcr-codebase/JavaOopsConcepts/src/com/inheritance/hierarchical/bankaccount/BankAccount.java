package com.inheritance.hierarchical.bankaccount;

public class BankAccount {
	 private String accountNumber;
	 private double balance;
	 
	 
	 public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	 public void displayAccountType(){
		 System.out.println("Account number is "+accountNumber);
		 System.out.println("Your balance is "+balance);
	 }
}
