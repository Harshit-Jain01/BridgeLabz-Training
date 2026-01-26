package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)            
@interface LogExecutionTime {
}
 class PerformanceTasks {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void mediumTask() {
        for (int i = 0; i < 1000000; i++);
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 50000000; i++);
    }
}


public class LogExecutionTimeDemo
{
    public static void main(String[] args) throws Exception {

        PerformanceTasks obj = new PerformanceTasks();
        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();
                method.invoke(obj);                 
                long endTime = System.nanoTime();

                long duration = endTime - startTime;

                System.out.println(
                    "Method: " + method.getName() +
                    " | Execution Time: " + duration + " ns"
                );
            }
        }
    }
}
