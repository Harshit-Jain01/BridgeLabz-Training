class LC414_ThirdMaximum{

    public static int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        for (int x : nums) {
            if (x == f || x == s || x == t) {
                continue;
            }
            if (x > f) {
                t = s;
                s = f;
                f = x;
            }
            else if (x > s) {
                t = s;
                s = x;
            }
            else if (x > t) {
                t = x;
            }
        }
        return (t == Long.MIN_VALUE) ? (int) f : (int) t;
    }
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};
        int[] nums4 = {1, 2, 2, 5, 3, 5};

        System.out.println(thirdMax(nums1)); // 1
        System.out.println(thirdMax(nums2)); // 2
        System.out.println(thirdMax(nums3)); // 1
        System.out.println(thirdMax(nums4)); // 2
    }
}
