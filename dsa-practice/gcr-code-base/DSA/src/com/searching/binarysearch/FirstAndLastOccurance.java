package com.searching.binarysearch;

import java.util.Scanner;


public class FirstAndLastOccurance {

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid=(right+left)/2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;   // move left
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid=(right+left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;   // move right
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int first=firstOccurrence(arr,target);
        int last=lastOccurrence(arr,target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
