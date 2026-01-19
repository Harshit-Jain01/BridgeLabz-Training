package com.collectionsframework.list;

class Node{
	Node next;
	int data;
	public Node(int data) {
		this.data = data;
	}	
}

class LinkedList1{
	Node head;
	
	public void addData(int x) {
		Node p=new Node(x);
		if(head==null) {
			head=p;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=p;
	}
	
	public void reverse() {
		if(head==null || head.next==null)
			return;
		Node curr=head.next;
		Node prev=head;
		while(curr!=null) {
			Node nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		head.next=null;
		head=prev;
		
	}
	
	public void printData() {
		if(head==null)return;
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
			
	}
}

public class ReverseList {	
	public static void main(String[] args) {
		LinkedList1 obj=new LinkedList1();
		obj.addData(1);
		obj.addData(2);
		obj.addData(3);
		obj.addData(4);
		
		System.out.println("before reversing");
		obj.printData();
		
		
		System.out.println("after reversing");
		obj.reverse();
		obj.printData();
		
	}
}
