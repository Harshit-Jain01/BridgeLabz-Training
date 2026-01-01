package com.inheritance.assistedproblem.employeemgt;

public class Developer extends Employee{
	
	private String progLanguage;
	
	public Developer(int id, String name, double salary,String lang) {
		super(id,name,salary);
		progLanguage=lang;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee is Developer");
		System.out.println("Programming lang known "+progLanguage);
	}
}
