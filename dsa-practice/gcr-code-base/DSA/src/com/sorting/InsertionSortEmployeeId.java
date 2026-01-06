package com.sorting;

public class InsertionSortEmployeeId {
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] employeeIds = {1045,1023,1099,1012,1056};
        System.out.println("Before Sorting:");
        for (int id : employeeIds) System.out.print(id + " ");
        insertionSort(employeeIds);
        System.out.println("\nAfter Sorting:");
        for (int id : employeeIds) System.out.print(id + " ");
    }
}
