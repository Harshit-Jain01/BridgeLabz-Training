package com.reflection;

import java.lang.reflect.Proxy;

interface Greeting{
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}



public class LoggingProxy{

    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            (proxy, method, args) -> {
                System.out.println("Calling method: " + method.getName());
                return method.invoke(target, args);
            }
        );
    }

    public static void main(String[] args) {
        Greeting g = (Greeting) createProxy(new GreetingImpl());
        g.sayHello();
    }
}
