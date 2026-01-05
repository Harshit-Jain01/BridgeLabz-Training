package com.stackandqueue.sortstack;

import java.util.Stack;

public class UseSortStack {
	
	  public static void main(String[] args) {
	        Stack<Integer>stack=new Stack<>();
	        stack.push(30);
	        stack.push(10);
	        stack.push(50);
	        stack.push(20);

	        SortStackUsingRecursion.sortStack(stack);

	        System.out.println(stack); 
}
}