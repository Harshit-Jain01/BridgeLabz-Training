package com.inheritance.hierarchical.bankaccount;

public class UseBankAccount {
	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount("87557547547",3400);
		ba.displayAccountType();
		System.out.println("---");
		SavingsAccount sa=new SavingsAccount("87557547547",3400,13.5);
		sa.displayAccountType();
		System.out.println("---");
		CheckingAccount ca=new CheckingAccount("87557547547",3400,1200);
		ca.displayAccountType();
		System.out.println("---");
		FixedDepositAccount fd=new FixedDepositAccount("87557547547",3400,15);
		fd.displayAccountType();
	}
}
