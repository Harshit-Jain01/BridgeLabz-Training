package com.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapper{

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Model Class
    static class Person {
        String name;
        int age;
    }

    //main method
    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Neha");
        data.put("age", 22);

        Person person = toObject(Person.class, data);

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
