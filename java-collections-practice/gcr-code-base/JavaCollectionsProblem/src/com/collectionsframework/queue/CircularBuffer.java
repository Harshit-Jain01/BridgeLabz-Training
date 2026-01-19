package com.collectionsframework.queue;

import java.util.Scanner;

class MyQueue{
	int front,rear;
	int size;
	int []arr;
	
	public MyQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
		this.size=size;
	}
	
	public void insert(int x) {
	    if (front == -1) {
	        front = 0;
	        rear = 0;
	        arr[rear] = x;
	        return;
	    }
	    if ((rear + 1) % size == front) 
	        front = (front + 1) % size; 
	    rear = (rear + 1) % size;
	    arr[rear] = x;
	}
	
	public void display() {
	    if (front==-1){
	        System.out.println("Buffer empty");
	        return;
	    }
	    int i=front;
	    while(true){
	        System.out.print(arr[i] + " ");
	        if (i==rear)
	            break;
	        i=(i + 1) % size;
	    }
	    System.out.println();
	}

}

public class CircularBuffer {
	
	public static void main(String[] args) {
		System.out.println("queue buffer size is 4");
		
		int size=3;
		MyQueue queue=new MyQueue(size);
		
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		queue.display();
		
		queue.insert(60);
		queue.display();
		
		
		
	}
	
	
	
}
