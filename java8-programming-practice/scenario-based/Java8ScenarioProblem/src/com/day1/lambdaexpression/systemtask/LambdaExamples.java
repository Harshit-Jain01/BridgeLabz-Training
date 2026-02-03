package com.day1.lambdaexpression.systemtask;

import java.util.Arrays;
import java.util.List;

public class LambdaExamples {

    public static void main(String[] args) {

        // 1. run a task in a separate thread
        System.out.println("Running task in separate thread:");
        Thread t = new Thread(() ->
                System.out.println("Task is running in thread: " + Thread.currentThread().getName())
        );
        t.start();

        // 2. print numbers from a list
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        System.out.println("\nPrinting numbers from list:");
        numbers.forEach(n -> System.out.println(n));

        // 3. check even or odd
        System.out.println("\nEven or Odd check:");
        numbers.forEach(n ->
                System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"))
        );

        // 4. add two numbers
        System.out.println("\nAddition of two numbers:");
        int a = 10;
        int b = 20;
        Add add = (x, y) -> x + y;
        System.out.println("Sum = " + add.add(a, b));

        // 5. find greater of two numbers
        System.out.println("\nGreater of two numbers:");
        Greater greater = (x, y) -> x > y ? x : y;
        System.out.println("Greater number = " + greater.find(a, b));
    }
}

// functional interface for addition
interface Add {
    int add(int a, int b);
}

// functional interface for greater number
interface Greater {
    int find(int a, int b);
}