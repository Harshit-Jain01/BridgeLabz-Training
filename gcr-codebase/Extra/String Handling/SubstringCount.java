import java.util.*;

public class SubstringCount{

    //count the substring 
    public static int countOccurance(String s, String word) {
        int count = 0;
        int length = s.length() - word.length();
        for (int i=0;i<=length;i++) {
            if (s.substring(i, i + word.length()).equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input 
        System.out.print("Enter string ");
        String str = input.nextLine();

        System.out.print("Enter substring ");
        String word = input.nextLine();

      //calling the method and displaying the result 
        int res = countOccurance(str, word);
        System.out.println("Substring occurs " + res );

        input.close();
    }
}