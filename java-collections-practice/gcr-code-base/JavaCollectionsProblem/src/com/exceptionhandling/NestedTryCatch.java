package com.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("Enter 4 values");
        for (int i = 0; i < 4; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println("Enter the index");
        int index = kb.nextInt();

        System.out.println("Enter the divisor");
        int divisor = kb.nextInt();

        try {
            int value = arr[index];

            try {
                int result = value / divisor;
                System.out.println(value + "/" + divisor + " = " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            kb.close();
        }
    }
}
