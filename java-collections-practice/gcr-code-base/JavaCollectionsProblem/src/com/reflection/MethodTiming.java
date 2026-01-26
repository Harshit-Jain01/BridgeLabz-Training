package com.reflection;

import java.lang.reflect.Method;

class Task {
    public void run() {
        for (int i = 0; i < 1_000_000; i++);
    }
}

public class MethodTiming{

    public static void measure(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);
            long start = System.nanoTime();
            method.invoke(obj);
            long finish= System.nanoTime();
            System.out.println("Execution Time: " + (finish - start) + " ns");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        measure(task, "run");
    }
}
