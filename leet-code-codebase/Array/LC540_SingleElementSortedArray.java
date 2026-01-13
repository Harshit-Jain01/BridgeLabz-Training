import java.util.*;

class LC540_SingleElementSortedArray{

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int ans = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNonDuplicate(nums);

        System.out.println("Single non-duplicate element:");
        System.out.println(result);

        sc.close();
    }
}
