import java.util.Scanner;

class LC242_ValidAnagram{

    public  static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        boolean ans = true;
        int[] saray = new int[26];
        int[] taray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            saray[s.charAt(i) - 'a']++;
            taray[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (saray[i] != taray[i]) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        System.out.println(isAnagram(s, t));

        sc.close();
    }
}
