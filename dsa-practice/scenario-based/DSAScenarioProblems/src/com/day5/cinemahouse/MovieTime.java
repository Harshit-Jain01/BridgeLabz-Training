package com.day5.cinemahouse;

import java.time.LocalTime;

public class MovieTime {
	
	static public void sortTime(LocalTime []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].isAfter(arr[j+1]))
				{
					LocalTime temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
}
