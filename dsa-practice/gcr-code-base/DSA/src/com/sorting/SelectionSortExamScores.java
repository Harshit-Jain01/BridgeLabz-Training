package com.sorting;

public class SelectionSortExamScores {
    public static void selectionSort(int[] scores){
        int n=scores.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(scores[j]<scores[min])min=j;
            }
            int temp=scores[min];
            scores[min]=scores[i];
            scores[i]=temp;
        }
    }
    public static void main(String[] args){
        int[] examScores={78,45,89,32,67,90,55};
        System.out.println("Before Sorting:");
        for(int s:examScores)System.out.print(s+" ");
        selectionSort(examScores);
        System.out.println("\nAfter Sorting:");
        for(int s:examScores)System.out.print(s+" ");
    }
}
