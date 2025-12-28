import java.util.Scanner;

class MinimumElementSum{

    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int sum = 0;

            while (a != 0) {
                int d = a % 10;
                sum += d;
                a /= 10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = kb.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            nums[i] = kb.nextInt();
        }

        int result = minElement(nums);
        System.out.println("Minimum digit sum is: " + result);

        kb.close();
    }
}
