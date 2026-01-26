package com.reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfoDemo {
    public static void main(String[] args) throws Exception {

        // Accept class name
    	Scanner kb=new Scanner(System.in);
    	System.out.println("enter the class name (for e.g. java.util.ArrayList) ");
    	String className=kb.nextLine();
        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        // Fields
        System.out.println("\nFields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        // Methods
        System.out.println("\nMethods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }

        // Constructors
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
