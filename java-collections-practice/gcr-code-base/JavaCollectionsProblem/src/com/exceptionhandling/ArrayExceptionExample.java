package com.exceptionhandling;

import java.util.Scanner;

public class ArrayExceptionExample {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		 int[] arr = null; 

	        try {
	            System.out.println("Enter 5 values");
	            arr = new int[5];
	            for (int i = 0; i < 5; i++) {
	                arr[i] = kb.nextInt();
	            }

	            System.out.println("Enter the index no");
	            int index = kb.nextInt();
	            int num = arr[index];
	            System.out.println("Value at index " + index + ": " + num);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid index!");
	        } catch (NullPointerException e) {
	            System.out.println("Array is not initialized!");
	        } finally {
	            kb.close();
	        }
	    }
	}
	