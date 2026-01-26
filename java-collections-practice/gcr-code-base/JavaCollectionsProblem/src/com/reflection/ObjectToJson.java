package com.reflection;

import java.lang.reflect.Field;

class Human{
    public String name;
    public int age;
}


public class ObjectToJson{

    public static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                sb.append("\"")
                  .append(fields[i].getName())
                  .append("\": \"")
                  .append(fields[i].get(obj))
                  .append("\"");
                if (i < fields.length - 1) sb.append(", ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        Human p = new Human();
        p.name = "Bob";
        p.age = 29;

        System.out.println(toJson(p));
    }
}

