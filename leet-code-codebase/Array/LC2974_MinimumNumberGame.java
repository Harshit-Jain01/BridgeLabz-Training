import java.util.*;

class LC2974_MinimumNumberGame {

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                arr[i + 1] = nums[i];
            else
                arr[i - 1] = nums[i];
        }
        return arr;
    }

    // main method
    public static void main(String[] args) {
        LC2974_MinimumNumberGame obj = new LC2974_MinimumNumberGame();

        int[] nums = {2, 7, 9, 6, 4, 6};
        int[] result = obj.numberGame(nums);

        System.out.println(Arrays.toString(result));
    }
}
