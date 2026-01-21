package com.day8.movietime;

import java.util.List;

public class SortShowTime {
	
	public static List<Movie> sortTime(List<Movie> list) {
	
		 for(int i=0;i<list.size();i++) {
			 for(int j=i;j>0;j--) {
				 Movie m1=list.get(j);
				 Movie m2=list.get(j-1);
				 if(list.get(j).getTime().isBefore(list.get(j-1).getTime()))
				 {
					 list.set(j,m2);
					 list.set(j-1,m1); 
				 }
				 else 
					 break;
				 
			 }
		 }
		 return list;
	}

}
