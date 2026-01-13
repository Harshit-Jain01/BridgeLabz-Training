package com.day3.parceltracker;

public class Delivery {
	public static void main(String[] args) {
		
		ParcelStages p1=new ParcelStages();
		p1.addStage("Packed");
		p1.addStage("Shipped");
		p1.addStage("Intransit");
		p1.addStage("Delivered");
		
		p1.display();
		
		p1.addcheckpoints("In progress",33);
		
		p1.display();
		
		ParcelStages p2=new ParcelStages();
		p2.addStage("Packed");
		p2.addStage("Shipped");
		p2.display();
	}
}
