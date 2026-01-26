package com.annotations.cacheresult;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, String methodName, Object... args)
            throws Exception {

        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.getName().equals(methodName) &&
                method.isAnnotationPresent(CacheResult.class)) {

                String cacheKey = method.getName() + Arrays.toString(args);

                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result for " + cacheKey);
                    return cache.get(cacheKey);
                }

                //Compute and cache result
                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            }
        }

        throw new NoSuchMethodException("Cached method not found");
    }
}
