package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)            
@interface Todo {

    String task();                    
    String assignedTo();               
    String priority() default "MEDIUM"; 
}

class ProjectFeatures {

    @Todo(
        task = "Implement user login",
        assignedTo = "Nikhil",
        priority = "HIGH"
    )
    public void loginFeature() {
        // pending
    }

    @Todo(
        task = "Add payment gateway",
        assignedTo = "Ankit"
    )
    public void paymentFeature() {
        // pending
    }

    @Todo(
        task = "Improve UI responsiveness",
        assignedTo = "Neha",
        priority = "LOW"
    )
    public void uiEnhancement() {
        // pending
    }
}





public class TodoDemo{

    public static void main(String[] args) {

        Class<ProjectFeatures> cls = ProjectFeatures.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println(
                    "Method: " + method.getName() +
                    " | Task: " + todo.task() +
                    " | Assigned To: " + todo.assignedTo() +
                    " | Priority: " + todo.priority()
                );
            }
        }
    }
}
