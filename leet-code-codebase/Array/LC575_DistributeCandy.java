import java.util.*;

public class LC575_DistributeCandy{

    public static int distributeCandies(int[] c) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }

        if (set.size() <= c.length / 2)
            return set.size();

        return c.length / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candies: ");
        int n = sc.nextInt();

        int[] c = new int[n];
        System.out.println("Enter candy types:");
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int result = distributeCandies(c);
        System.out.println("Maximum unique candies sister can get = " + result);

        sc.close();
    }
}
