import java.util.*;
class LC520_DetectCapital{
    public static boolean detectCapitalUse(String s){
        int[] small=new int[26];
        int[] big=new int[26];
        int sm=0,bi=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c<91){
                big[c-'A']++;
                bi++;
            }else{
                small[c-'a']++;
                sm++;
            }
        }
        if(bi==0 || sm==0 || (s.charAt(0)<91 && bi==1 && sm==(s.length()-1)))
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s=sc.nextLine();
        System.out.print(detectCapitalUse(s));
        sc.close();
    }
}
