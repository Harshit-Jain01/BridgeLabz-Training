package com.stackandqueue.slidingwindow;

public class UseSlidingWindow{
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindow.maxSlidingWindow(nums, k);
        for (int x:result) 
            System.out.print(x + " ");
        
    }
}

