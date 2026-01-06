package com.sorting;

public class CountingSortStudentAges {
    public static void countingSort(int[] ages){
        int min=10,max=18;
        int range=max-min+1;
        int[] count=new int[range];
        int[] output=new int[ages.length];
        for(int a:ages)count[a-min]++;
        for(int i=1;i<range;i++)count[i]+=count[i-1];
        for(int i=ages.length-1;i>=0;i--){
            int a=ages[i];
            output[count[a-min]-1]=a;
            count[a-min]--;
        }
        for(int i=0;i<ages.length;i++)ages[i]=output[i];
    }
    public static void main(String[] args){
        int[] studentAges={15,12,17,10,14,16,13,18,11};
        System.out.println("Before Sorting:");
        for(int a:studentAges)System.out.print(a+" ");
        countingSort(studentAges);
        System.out.println("\nAfter Sorting:");
        for(int a:studentAges)System.out.print(a+" ");
    }
}
