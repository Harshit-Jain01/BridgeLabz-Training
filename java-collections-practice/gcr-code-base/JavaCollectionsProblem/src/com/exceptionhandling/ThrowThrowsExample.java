package com.exceptionhandling;

import java.util.Scanner;

public class ThrowThrowsExample {

	static public double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
		 if (amount < 0 || rate < 0) {
	            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
	        }
		return amount*rate*years/100;
	}
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		  try {
	            System.out.println("Enter amount:");
	            double amount = kb.nextDouble();

	            System.out.println("Enter rate:");
	            double rate = kb.nextDouble();

	            System.out.println("Enter years:");
	            int years = kb.nextInt();

	            double interest = calculateInterest(amount, rate, years);
	            System.out.println("Calculated Interest: " + interest);

	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid input: Amount and rate must be positive");
	        } finally {
	            kb.close();
	        }
	    }
	}