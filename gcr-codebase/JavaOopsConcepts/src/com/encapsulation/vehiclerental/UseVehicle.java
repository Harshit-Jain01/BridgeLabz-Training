package com.encapsulation.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class UseVehicle {
	
	public static void main(String[] args) {
		
		List<Vehicle>list=new ArrayList();
		list.add(new Bike("MP3400","Bike",123,20,"ino5646546"));
		list.add(new Car("CG3070","Car",300,70,"ino7746546"));
		list.add(new Truck("DL9870","Truck",500,57,"ino6532246"));
		
		for(Vehicle v:list) {
			v.display();
			int day=v.getDays();
			System.out.println("Total rental cost is "+v.calculateRentalCost(day));
			
			if(v instanceof Insurable) {
				Insurable i=(Insurable)v;
			System.out.println("Total insurance cost is "+i.calculateInsurance());
			System.out.println(i.getInsuranceDetails());
			}
			System.out.println("------");
		}
		
	}

}
