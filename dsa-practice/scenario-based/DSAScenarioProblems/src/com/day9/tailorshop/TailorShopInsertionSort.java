package com.day9.tailorshop;

import java.time.LocalDate;
import java.util.Arrays;

public class TailorShopInsertionSort {

    // Insertion Sort based on delivery deadline
    public static void sortByDeadline(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deadline.isAfter(key.deadline)) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Ramesh", LocalDate.of(2026, 1, 15)),
                new Order(102, "Suresh", LocalDate.of(2026, 1, 18)),
                new Order(103, "Mahesh", LocalDate.of(2026, 1, 20)),
                new Order(104, "Rajesh", LocalDate.of(2026, 2, 16))
        };

        System.out.println("Before Sorting:");
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

        sortByDeadline(orders);

        System.out.println("\nAfter Sorting by Delivery Deadline:");
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }
}