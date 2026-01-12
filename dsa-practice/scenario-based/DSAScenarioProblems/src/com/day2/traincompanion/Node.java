package com.day2.traincompanion;

public class Node {
	
	private String name;
	private Node prev;
	private Node next;
	
	public Node(String name) {
		this.name=name;
		prev=null;
		next=null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
