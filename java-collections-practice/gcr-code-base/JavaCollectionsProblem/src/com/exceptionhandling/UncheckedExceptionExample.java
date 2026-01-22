package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {
	
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}
		catch(ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		} finally {
            kb.close();
        }
		
	}
}
