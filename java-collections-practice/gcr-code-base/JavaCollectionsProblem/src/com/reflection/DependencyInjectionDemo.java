package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {

    @Inject
    Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}




public class DependencyInjectionDemo {

    public static void injectDependencies(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    field.setAccessible(true);
                    Object dep = field.getType()
                                      .getDeclaredConstructor()
                                      .newInstance();
                    field.set(obj, dep);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        injectDependencies(car);
        car.drive();
    }
}
