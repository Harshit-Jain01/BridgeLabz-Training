package com.inheritance.assistedproblem.employeemgt;

public class Manager extends Employee {
	 
	private int teamSize;
	
	public Manager(int id, String name, double salary,int size) {
		super(id,name,salary);
		teamSize=size;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee is Manager with teamSize "+teamSize);
		
	}
}
