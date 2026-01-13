import java.util.*;

class LC448_NumberDisappear{

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Disappeared numbers are:");
        System.out.println(result);

        sc.close();
    }
}
