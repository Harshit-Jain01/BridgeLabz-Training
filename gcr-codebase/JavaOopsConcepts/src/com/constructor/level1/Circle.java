package com.constructor.level1;

import java.util.Scanner;

public class Circle {
	
	//attributes
	private double radius;
	
	//constructor chaining
	public Circle() {
		System.out.println("enter radius");
		Scanner kb=new Scanner(System.in);
		this.radius=kb.nextDouble();
		System.out.println("User radius:"+this.radius);
		
	}

	public Circle(double radius) {
		this();
		System.out.println("default radius: "+radius);
	}

	public static void main(String[] args) {
		
		// creating object
		Circle c=new Circle(10);
		
		
	}

}
