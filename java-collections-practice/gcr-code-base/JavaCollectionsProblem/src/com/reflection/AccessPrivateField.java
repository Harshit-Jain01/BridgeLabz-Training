package com.reflection;

import java.lang.reflect.Field;

 class Person{
	 
    private int age = 25;
 }



public class AccessPrivateField{
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class<?> cls = p.getClass();
        Field field = cls.getDeclaredField("age");

        // Allow access to private field
        field.setAccessible(true);  
        field.set(p, 30);             

        int ageValue = (int) field.get(p);
        System.out.println("Updated Age: " + ageValue);
    }
}
