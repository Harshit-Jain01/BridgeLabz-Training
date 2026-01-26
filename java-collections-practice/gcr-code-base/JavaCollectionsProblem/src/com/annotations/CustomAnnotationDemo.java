package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)            
@interface TaskInfo {
    int priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Mohit")
    public void completeTask() {
        System.out.println("Task is completed");
    }
}




public class CustomAnnotationDemo {

    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        Method method = manager.getClass().getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Task Priority : " + taskInfo.priority());
            System.out.println("Assigned To   : " + taskInfo.assignedTo());
        }
    }
}
