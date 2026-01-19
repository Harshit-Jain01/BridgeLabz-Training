package com.collectionsframework.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	
	public static Queue<Integer> reverseQueue(Queue<Integer> q){
		Stack<Integer>stack=new Stack<>();
		while(!q.isEmpty()) {
			stack.add(q.poll());
		}
		Queue<Integer>myqueue=new LinkedList<>();
		while(!stack.isEmpty()) {
			myqueue.add(stack.pop());
		}
		
		return myqueue;
	}
	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Original queue "+queue);
		System.out.println("Reverse queue "+ReverseQueue.reverseQueue(queue));
		
		
	}
}
