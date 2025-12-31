import java.util.Scanner;

class LC151_ReverseWord {

    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LC151_ReverseWord sol = new LC151_ReverseWord();

        System.out.println("Enter string:");
        String input = sc.nextLine();

        System.out.println(sol.reverseWords(input));
        sc.close();
    }
}
