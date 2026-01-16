package com.day4.examcell;

public class RankGenerator {
	
	public static void merge(Student []arr, int start,int end) {
		
		if(start<end) {
			int mid=(start+end)/2;
			merge(arr,start,mid);
			merge(arr,mid+1,end);
			mergeSort(arr,start,mid,end);
		}
	}
	
	public static void mergeSort(Student []arr,int start,int mid,int end ) {
		int first=start,sec=mid+1;
		Student []brr=new Student[end-start+1];
		int idx=0;
		while(first<=mid && sec<=end) {
			if(arr[first].score>=arr[sec].score)
				brr[idx]=arr[first++];
			else 
				brr[idx]=arr[sec++];
			idx++;			
		}
		while(first<=mid) {
			brr[idx++]=arr[first++];
		}
		while(sec<=end) {
			brr[idx++]=arr[sec++];
		}
		for(int i=0,j=start;i<brr.length;i++,j++) {
			arr[j]=brr[i];		
		}
		
	}
}
