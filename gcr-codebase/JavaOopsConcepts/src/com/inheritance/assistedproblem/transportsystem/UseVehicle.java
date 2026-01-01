package com.inheritance.assistedproblem.transportsystem;

public class UseVehicle {

	public static void main(String[] args) {
		Vehicle []arr=new Vehicle[3];
		arr[0]=new Car(180,"Petrol",4);
		arr[1]=new Truck(220,"Diesel",16);
		arr[2]=new Motorcycle(130,"Petrol",40);
		
		for(int i=0;i<3;i++) {
			arr[i].displayInfo();
			System.out.println("-----");
		}
		
	}
}
