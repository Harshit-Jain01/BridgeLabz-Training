package com.day5.robowarehouse;

public class RoboWarehouse {
	public static void main(String[] args) {
		
		LoadingRobot load=new LoadingRobot();
		load.addParcel(23);
		load.addParcel(34);
		load.addParcel(4);
		load.addParcel(89);
		
		load.display();
		
		
	}
}
