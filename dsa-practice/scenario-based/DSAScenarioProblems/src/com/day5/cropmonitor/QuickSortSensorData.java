package com.day5.cropmonitor;

public class QuickSortSensorData {

    // Quick Sort logic
    public static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition based on timestamp
    private static int partition(SensorData[] arr, int low, int high) {
        long pivot = arr[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].timestamp < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(SensorData[] arr, int i, int j) {
        SensorData temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method
    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData(1700012000, 26.5),
            new SensorData(1699998000, 24.1),
            new SensorData(1700005000, 25.3),
            new SensorData(1699984000, 23.8)
        };

        System.out.println("Before Sorting:");
        for (SensorData s : data) {
            System.out.println(s);
        }

        quickSort(data, 0, data.length - 1);

        System.out.println("\nAfter Sorting by Timestamp:");
        for (SensorData s : data) {
            System.out.println(s);
        }
    }
}
