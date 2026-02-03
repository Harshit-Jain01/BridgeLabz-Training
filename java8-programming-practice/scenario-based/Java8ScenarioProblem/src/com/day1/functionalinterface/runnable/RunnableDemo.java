package com.day1.functionalinterface.runnable;


public class RunnableDemo {

    public static void main(String[] args) {

        // 1. Run a background task using Runnable
        Runnable backgroundTask = () -> {
            System.out.println("Background task is running...");
        };
        Thread t1 = new Thread(backgroundTask);
        t1.start();

        // 2. Execute a file cleanup task using Runnable
        Runnable fileCleanupTask = () -> {
            System.out.println("Cleaning temporary files...");
            System.out.println("File cleanup completed.");
        };
        Thread t2 = new Thread(fileCleanupTask);
        t2.start();

        // 3. Print a message in a separate thread using Runnable
        Runnable messageTask = () -> {
            System.out.println("Hello from a separate thread!");
        };
        Thread t3 = new Thread(messageTask);
        t3.start();
    }
}
