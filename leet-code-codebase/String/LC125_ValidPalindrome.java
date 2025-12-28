import java.util.Scanner;

class LC125_ValidPalindrome{

    public static boolean isPalindrome(String s){

        String sb="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57))
                sb+=ch;
        }

        sb=sb.toLowerCase();
        int n=sb.length();

        for(int i=0;i<n/2;i++){
            if(sb.charAt(i)!=sb.charAt(n-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter string:");
        String s=kb.nextLine();

        boolean result=isPalindrome(s);
        System.out.println("Is Palindrome: "+result);

        kb.close();
    }
}
