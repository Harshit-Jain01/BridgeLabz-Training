package com.day5.robowarehouse;

import java.util.ArrayList;
import java.util.List;

public class LoadingRobot {
	  List<Integer>weight=new ArrayList();
	
	 public void addParcel(int w) {
		weight.add(w);
		for(int i=weight.size()-1;i>0;i--) {
			int w1=weight.get(i);
			int w2=weight.get(i-1);
			if(w1<w2) {
				weight.set(i-1, w1);
				weight.set(i, w2);	
			}
			else 
				break;
		}	
	}
	
	public void display() {
		for(int x:weight)
			System.out.println(x);
	}
}
