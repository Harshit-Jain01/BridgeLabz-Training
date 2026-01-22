package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {

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
		finally {
			System.out.println( "Operation completed");
            kb.close();
        }
		
	}
}

