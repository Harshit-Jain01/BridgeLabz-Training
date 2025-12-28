import java.util.*;

class SumIndicesWithKSet{

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            int c = 0;
            int temp = i;

            while (temp != 0) {
                int r = temp % 2;
                if (r == 1)
                    c++;
                temp /= 2;
            }

            if (c == k)
                sum += nums.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 1, 5, 2);
        int k = 1;

        int result = sumIndicesWithKSetBits(nums, k);
        System.out.println("Sum = " + result);
    }
}
