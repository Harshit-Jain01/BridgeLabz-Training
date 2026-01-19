package com.day7.flashDealz;

import java.util.List;

public class QuickSortProducts {

    public static void quickSort(List<Product> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Product> list, int low, int high) {
        int pivot = list.get(high).discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Sort by discount in descending order
            if (list.get(j).discount > pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Product> list, int i, int j) {
        Product temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
