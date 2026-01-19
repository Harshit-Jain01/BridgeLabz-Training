package com.collectionsframework.queue;

import java.util.*;
public class StackUsingQueues {
	
	Queue<Integer>q1=new LinkedList<>();
	Queue<Integer>q2=new LinkedList<>();
	
	public void push(int x) {
		while(!q1.isEmpty())
			q2.add(q1.poll());
		q1.add(x);	
		System.out.println("pushed:"+x);
		while(!q2.isEmpty())
			q1.add(q2.poll());
	}
	
	public void pop()
	{	
		if(q1.isEmpty()) {
		System.out.println("Stack is empty");
		return;
		}
		System.out.println("popped:"+q1.poll());
	}
	public void peek()
	{	
		if(q1.isEmpty()) {
		System.out.println("Stack is empty");
		return;
		}
		System.out.println("top element is:"+q1.peek());
	}
	
	
	
	public static void main(String[] args) {
		StackUsingQueues stack=new StackUsingQueues();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.peek();
	}

}
