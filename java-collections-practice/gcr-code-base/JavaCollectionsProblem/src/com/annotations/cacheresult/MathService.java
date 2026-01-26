package com.annotations.cacheresult;


public class MathService {

    @CacheResult
    public int expensiveSquare(int n) {
        System.out.println("Computing square for: " + n);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return n * n;
    }
}
