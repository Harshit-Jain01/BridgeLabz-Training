import java.util.Scanner;

class LC557_ReverseWordsIII{

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            StringBuilder hj = new StringBuilder(arr[i]);
            sb.append(hj.reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();   

        String result = reverseWords(input);
        System.out.println("Output:");
        System.out.println(result);

        sc.close();
    }
}
