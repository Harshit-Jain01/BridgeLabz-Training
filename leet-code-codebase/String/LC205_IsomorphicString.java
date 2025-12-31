import java.util.Scanner;

class LC205_IsomorphicString{

    public static boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];
        int[] brr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (arr[c1] == 0 && brr[c2] == 0) {
                arr[c1] = c2;
                brr[c2] = c1;
            } else if (arr[c1] != c2 || brr[c2] != c1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));

        sc.close();
    }
}
