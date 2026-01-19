import java.util.*;

class LC628_MaximumProductOfThreeNumber{

    public static int maximumProduct(int[] nums) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE, t = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x > f) {
                t = s;
                s = f;
                f = x;
            } else if (x > s) {
                t = s;
                s = x;
            } else if (x > t) {
                t = x;
            }

            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        return Math.max(f * s * t, f * min1 * min2);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {-10, -10, 5, 2};

        System.out.println("Maximum Product (nums1): " + maximumProduct(nums1));
        System.out.println("Maximum Product (nums2): " + maximumProduct(nums2));
    }
}
