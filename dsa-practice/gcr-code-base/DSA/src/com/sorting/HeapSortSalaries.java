package com.sorting;

public class HeapSortSalaries {
    public static void heapSort(int[] salary){
        int n=salary.length;
        for(int i=n/2-1;i>=0;i--)heapify(salary,n,i);
        for(int i=n-1;i>0;i--){
            int temp=salary[0];
            salary[0]=salary[i];
            salary[i]=temp;
            heapify(salary,i,0);
        }
    }
    public static void heapify(int[] salary,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&salary[l]>salary[largest])largest=l;
        if(r<n&&salary[r]>salary[largest])largest=r;
        if(largest!=i){
            int temp=salary[i];
            salary[i]=salary[largest];
            salary[largest]=temp;
            heapify(salary,n,largest);
        }
    }
    public static void main(String[] args){
        int[] salaries={45000,30000,75000,50000,60000,40000};
        System.out.println("Before Sorting:");
        for(int s:salaries)System.out.print(s+" ");
        heapSort(salaries);
        System.out.println("\nAfter Sorting:");
        for(int s:salaries)System.out.print(s+" ");
    }
}
