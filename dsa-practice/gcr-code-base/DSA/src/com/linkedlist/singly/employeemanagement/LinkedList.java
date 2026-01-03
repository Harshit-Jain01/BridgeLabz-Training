package com.linkedlist.singly.employeemanagement;

public class LinkedList {

	EmployeeNode head;
	
	public void addAtBegining(int id, String name, String department, double salary) {
		EmployeeNode p=new EmployeeNode(id,name,department,salary);
		if(head==null){
			head=p;
			return;	
		}
		EmployeeNode temp=head;
		p.setNext(temp);
		head=p;	
	}
	
	public void addAtLast(int id, String name, String department, double salary) {
		EmployeeNode p=new EmployeeNode(id,name,department,salary);
		if(head==null){
			head=p;
			return;	
		}
		EmployeeNode temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(p);
	}
	public void addAtPosition(int id, String name, String department, double salary,int pos) {
		
		EmployeeNode p=new EmployeeNode(id,name,department,salary);
		
		if (pos == 0) { // insert at beginning
	        p.setNext(head);
	        head = p;
	        return;
	    }
		
			EmployeeNode temp=head;
			int count=0;
			while(temp!=null && count<pos-1 ) {
				count++;
				temp=temp.getNext();
			}
			if (temp == null) {
		        System.out.println("Invalid position");
		        return;
		    }
			
			p.setNext(temp.getNext());
			temp.setNext(p);
	}
	
	public void search(int id) {
		if(head==null)return;

		EmployeeNode temp=head;
		while(temp!=null) {
			if(temp.getId()==id) {
				System.out.println("Employee details");
				System.out.println("Id:"+temp.getId());
				System.out.println("Name:"+temp.getName());
				System.out.println("Dept:"+temp.getDepartment());
				System.out.println("Salary:"+temp.getSalary());
				return;
			}
			temp=temp.getNext();
		}
		
			System.out.println("Id not available");
	}
	
	public void delete(int id) {
		if(head==null)return;
		 if (head.getId() == id) {
		        head = head.getNext();
		        System.out.println(id + " Id deleted");
		        return;
		    }
		EmployeeNode next=head;
		EmployeeNode prev=next;
		boolean flag=true;
		while(next!=null) {
			
			if(next.getId()==id) {
				prev.setNext(next.getNext());
				System.out.println(id+"Id deleted");	
				flag=false;
				break;
			}
			prev=next;
			next=next.getNext();
		}
		if(flag)
			System.out.println("Id not available");		
		
	}
	
	
	
	public void display() {
		if(head==null)
		{
			System.out.println("No data available");
			return;
		}
		else {
			EmployeeNode temp=head;
			while(temp!=null) {
				System.out.println(temp.getId()+","+temp.getName()+","+temp.getSalary()+","+temp.getDepartment());
				temp=temp.getNext();
			}
		}
	}
}
