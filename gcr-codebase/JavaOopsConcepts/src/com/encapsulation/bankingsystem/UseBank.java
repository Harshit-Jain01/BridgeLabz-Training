package com.encapsulation.bankingsystem;

public class UseBank {
	public static void main(String[] args) {
	
		BankAccount ac=new SavingsAccount("237755547432","Roy",4500);
		System.out.println(ac.getHolderName() + " Interest: " + ac.calculateInterest());
		ac=new CurrentAccount("67444338009","Rachit",507);
		System.out.println(ac.getHolderName() + " Interest: " + ac.calculateInterest());
	}
	
}
