import java.util.Scanner;

public class LC521_LongestUncommonSubsequence{

    public  static int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;

        int ans = 0;
        if (a.length() > b.length())
            ans = a.length();
        else
            ans = b.length();

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        int result = findLUSlength(a, b);

        System.out.println("Longest Uncommon Subsequence Length: " + result);

        sc.close();
    }
}
