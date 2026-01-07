package com.searching.binarysearch;

import java.util.Scanner;

public class RotationPoint {
	public static  int rotationPoint(int []arr) {
		int left=0;
		int right=arr.length-1;
		
		  while (left<right) {
	            int mid=(right + left)/2;
	            if (arr[mid] > arr[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }
	
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=kb.nextInt();
		int []arr=new int[n];
		System.out.println("enter the sorted rotated array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(rotationPoint(arr));
	}
}
