package com.day3.parceltracker;

public class ParcelStages {

	Node head;
	public void addStage(String stage) {
		Node p=new Node(stage);
		if(head==null) {
			head=p;
			return;
		}
		Node temp=head;
		while(temp.getNext()!=null)
			temp=temp.getNext();
		temp.setNext(p);
	}
	
	public void addcheckpoints(String stage,int pos ) {
		if(pos<1)
		{
			System.out.println("Wrong position");
			return;
		}
		if(head==null && pos!=1) {
			System.out.println("Missing parcel");
		}
		Node p=new Node(stage);
		if(pos==1) {
			if(head!=null) {
				p.setNext(head);
			}
			head=p;
			return;
		}
		Node temp=head;
		int c=1;
		while( temp!=null && c<pos-1 ) {
			temp=temp.getNext();
			c++;
		}
		if(temp==null)
		{
			System.out.println("wrong position");
			return;
		}
		
		p.setNext(temp.getNext());
		temp.setNext(p);		
	}
	
	public void display() {
		if(head==null) {
			System.out.println("parcel is missing");
			return;}
		Node temp=head;
		Node prev=null;
		System.out.println("Parcel tracking status");
		while(temp!=null) {
			System.out.println(temp.getStatus());
			prev=temp;
			temp=temp.getNext();
		}
		if(!prev.getStatus().equalsIgnoreCase("delivered"))
			System.out.println("Parcel is missing");
		
	}
	
}
