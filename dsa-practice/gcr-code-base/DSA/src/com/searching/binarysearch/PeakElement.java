package com.searching.binarysearch;

import java.util.Scanner;

public class PeakElement {
	public static  int peakElement(int []arr) {
		int left=0;
		int right=arr.length-1;
		
		  while (left < right) {
	            int mid=left + (right - left) / 2;
	             if(arr[mid]<arr[mid+1]) {
	                left= mid+1;
	            }
	            else
	            {
	            	right=mid;
	            }
	        }
		 return arr[left];
	       
	    }
	
	
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=kb.nextInt();
		int []arr=new int[n];
		System.out.println("enter  array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println(peakElement(arr));
	}	

}
