import java.util.Scanner;

class LC344_ReverseString{

    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();
        reverseString(arr);

        System.out.println("Reversed string:");
        System.out.println(new String(arr));

        sc.close();
    }
}
