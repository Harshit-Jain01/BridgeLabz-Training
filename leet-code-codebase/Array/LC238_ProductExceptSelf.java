import java.util.*;

class LC238_ProductExceptSelf{

    public static int[] productExceptSelf(int[] nums) {
        int s = 1;
        int[] arr = new int[nums.length];
        int c = 0;

        for (int x : nums) {
            if (x == 0)
                c++;
            else
                s *= x;

            if (c > 1)
                s = 0;
        }

        if (c == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0)
                    arr[i] = 0;
                else
                    arr[i] = s;
            }
        } else if (c > 1) {
            Arrays.fill(arr, 0);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0)
                    arr[i] = s / nums[i];
                else
                    arr[i] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        System.out.println("Product Except Self:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
