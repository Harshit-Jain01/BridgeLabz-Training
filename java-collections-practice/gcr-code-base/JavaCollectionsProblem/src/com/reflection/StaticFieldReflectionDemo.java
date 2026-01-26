package com.reflection;

import java.lang.reflect.Field;


class Configuration {
    private static String API_KEY = "OLD_KEY";
}


public class StaticFieldReflectionDemo {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("com.reflection.Configuration");
        Field field = cls.getDeclaredField("API_KEY");

        field.setAccessible(true);
        field.set(null, "NEW_SECRET_KEY");   

        System.out.println("Updated API_KEY: " + field.get(null));
    }
}
