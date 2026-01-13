import java.util.*;

class LC455_AssignCookies{

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);

        int i = 0, j = 0, ans = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                ans++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of children:");
        int n = sc.nextInt();
        int[] g = new int[n];

        System.out.println("Enter greed factors:");
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }

        System.out.println("Enter number of cookies:");
        int m = sc.nextInt();
        int[] s = new int[m];

        System.out.println("Enter cookie sizes:");
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }

        int result = findContentChildren(g, s);

        System.out.println("Maximum number of content children:");
        System.out.println(result);

        sc.close();
    }
}
