package com.annotations.cacheresult;

public class CacheResultDemo {
	 public static void main(String[] args) throws Exception {

	        MathService service = new MathService();

	        System.out.println(CacheExecutor.invoke(service, "expensiveSquare", 5));
	        System.out.println(CacheExecutor.invoke(service, "expensiveSquare", 5));
	        System.out.println(CacheExecutor.invoke(service, "expensiveSquare", 10));
	        System.out.println(CacheExecutor.invoke(service, "expensiveSquare", 5));
	    }
}
