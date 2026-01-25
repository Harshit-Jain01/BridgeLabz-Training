package com.day9.medwarehouse;

import java.time.LocalDate;

public class MedWarehouseApp {

	    public static void mergeSort(Medicine[] meds, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(meds, left, mid);
	            mergeSort(meds, mid + 1, right);

	            merge(meds, left, mid, right);
	        }
	    }

	    private static void merge(Medicine[] meds, int left, int mid, int right) {

	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        Medicine[] L = new Medicine[n1];
	        Medicine[] R = new Medicine[n2];

	        for (int i = 0; i < n1; i++)
	            L[i] = meds[left + i];

	        for (int j = 0; j < n2; j++)
	            R[j] = meds[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (!L[i].expiryDate.isAfter(R[j].expiryDate)) {
	                meds[k++] = L[i++];
	            } else {
	                meds[k++] = R[j++];
	            }
	        }

	        while (i < n1) {
	            meds[k++] = L[i++];
	        }

	        while (j < n2) {
	            meds[k++] = R[j++];
	        }
	    }
	


    public static void main(String[] args) {

        Medicine[] medicines = {
                new Medicine(101, "Paracetamol", LocalDate.of(2026, 2, 10)),
                new Medicine(102, "Insulin", LocalDate.of(2026, 1, 25)),
                new Medicine(103, "Aspirin", LocalDate.of(2026, 2, 5)),
                new Medicine(104, "Antibiotic", LocalDate.of(2026, 1, 20))
        };

        System.out.println("Before Sorting:");
        for (int i = 0; i < medicines.length; i++) {
            System.out.println(medicines[i]);
        }

       mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nAfter Sorting by Expiry Date:");
        for (int i = 0; i < medicines.length; i++) {
            System.out.println(medicines[i]);
        }
    }
}
