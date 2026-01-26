package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)   
@Target(ElementType.METHOD)            
@interface ImportantMethod{
    String level() default "HIGH";     
}

class ServiceManager {

    @ImportantMethod
    public void startService() {
        System.out.println("Service started");
    }

    @ImportantMethod(level = "LOW")
    public void logService() {
        System.out.println("Service logged");
    }

    public void helperMethod() {
        System.out.println("Helper method (not important)");
    }
}



public class ImportantMethodDemo {

    public static void main(String[] args) {

        Method[] methods = ServiceManager.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method Name : " + method.getName() +
                    " | Importance Level : " + im.level()
                );
            }
        }
    }
}
