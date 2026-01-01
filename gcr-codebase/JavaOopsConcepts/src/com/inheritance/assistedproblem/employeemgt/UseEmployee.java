package com.inheritance.assistedproblem.employeemgt;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e=new Developer(101,"Naman",56000,"Java");
		e.displayDetails();
		System.out.println("-----");
		e=new Intern(102,"Rahul",23000);
		e.displayDetails();
		System.out.println("-----");
		e=new Manager(103,"Shruti",5600,12);
		e.displayDetails();
	}
}
