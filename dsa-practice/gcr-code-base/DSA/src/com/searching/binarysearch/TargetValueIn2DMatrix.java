package com.searching.binarysearch;

public class TargetValueIn2DMatrix {
		
	public static boolean targetValue(int [][]arr,int value) {
		
		int left=0;
		int right=arr.length*arr[0].length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			int row=mid/arr[0].length;
			int col=mid%arr[0].length;
			if(arr[row][col]==value)
				return true;
			if(arr[row][col]>value)
				right=mid-1;
			if(arr[row][col]<value)
				left=mid+1;
		}
		
		return false;
	}
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		boolean value1=targetValue(arr,51);
		System.out.println(value1?"Value1 found":"Value1 not found");
		boolean value2=targetValue(arr,5);
		System.out.println(value2?"Value2 found":"Value2 not found");
	}
}
