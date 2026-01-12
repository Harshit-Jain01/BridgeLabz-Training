package com.day2.traincompanion;

public class Compartment {
	
	Node head;
	Node tail;
	
	public void addCompartment(String compartment) {
		Node p=new Node(compartment);
		if(head==null) {
			head=p;
			tail=p;
			return;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(p);
		p.setPrev(temp);	
		tail=p;
	}
	
	public void searchCompartment(String compartment) {
		if(head==null)
			return;
		Node temp=head;
		while(temp!=null) {
			if(temp.getName().equalsIgnoreCase(compartment))
			{
				System.out.println(compartment+"Compartment found");
				return;
			}
			temp=temp.getNext();
		}
		System.out.println(compartment+" Compartment not available");	
	}
	
	public void deleteCompartmet(String compartment) {
		if(head==null)return ;
		if(head.getName().equalsIgnoreCase(compartment)) {
			Node p=head.getNext();
			head.setNext(null);
			head=p;
			System.out.println("Compartment removed");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{	
			if(temp.getName().equalsIgnoreCase(compartment)) {
				if(temp.getNext()==null) {
					temp.getPrev().setNext(null);
					System.out.println("Compartment removed");
					return;
				}
				else {
					temp.getPrev().setNext(temp.getNext());
					temp.getNext().setPrev(temp.getPrev());
					System.out.println("Compartment removed");
					return;
				}
			}
			temp=temp.getNext();
		}
		
			
	}
	
	public void forward() {
		if(head==null)return;
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getName());
			temp=temp.getNext();	
		}	
	}
	public void backward() {
		if(head==null)
			return;
		Node temp=tail;
		while(temp!=null) {
			System.out.println(temp.getName());
			temp=temp.getPrev();
		}	
	}
	
	public void adjacentCompartment(String compartment) {
		if(head==null) {
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.getName().equalsIgnoreCase(compartment)) {
				if(temp.getPrev()!=null)
					System.out.println(compartment+" left compartment is "+temp.getPrev().getName());
				if(temp.getNext()!=null)
					System.out.println(compartment+" right compartment is "+temp.getNext().getName());
				
			}
			temp=temp.getNext();
			
		}
			
	}
	
	
}
