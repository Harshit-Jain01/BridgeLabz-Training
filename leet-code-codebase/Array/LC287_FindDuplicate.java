import java.util.*;

public class LC287_FindDuplicate{

    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int m : nums) {
            if (!set.add(m)) {
                return m;   // duplicate found
            }
        }
        return -1; // safety (though problem guarantees one duplicate)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers (one number will be duplicated):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(nums);

        System.out.println("The duplicate number is: " + duplicate);

        sc.close();
    }
}
