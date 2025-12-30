import java.util.*;

class LC169_MajorityElement{

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0)
            return nums[n / 2 - 1];
        else
            return nums[n / 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);

        sc.close();
    }
}
