import java.util.*;
class LC459_RepeatedSubstring{
    public static boolean repeatedSubstringPattern(String s){
        String d=s+s;
        return d.substring(1,d.length()-1).contains(s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sc.nextLine();
        System.out.print(repeatedSubstringPattern(s));
        sc.close();
    }
}
