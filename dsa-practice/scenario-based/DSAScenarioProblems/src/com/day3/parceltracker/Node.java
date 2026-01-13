package com.day3.parceltracker;

public class Node {

	private Node next;
	private String status;
	
	public Node( String status) {
		this.next = null;
		this.status = status;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
