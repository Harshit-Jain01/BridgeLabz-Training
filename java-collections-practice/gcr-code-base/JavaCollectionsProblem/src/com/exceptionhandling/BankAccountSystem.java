package com.exceptionhandling;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}

public class BankAccountSystem {
	
	static double deposit;
	
	public static double withdraw(double amount) {
		   if (amount < 0) {
	            throw new IllegalArgumentException("Invalid amount!");
	        }

	        if (amount > deposit) {
	            throw new InsufficientBalanceException("Insufficient balance!");
	        }
		return deposit-amount;
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the deposit amount");
		deposit=kb.nextDouble();
		System.out.println("enter the withdrawl amount");
		double withdrawl=kb.nextDouble();
		try
		{
			System.out.println("Withdrawal successful, new balance:"+withdraw(withdrawl));
		}catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
