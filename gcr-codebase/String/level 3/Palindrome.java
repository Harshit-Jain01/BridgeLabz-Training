import java.util.Scanner;

public class Palindrome{

    
    // Iterative comparison
    public static boolean isPalindrome1(String text) {

        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive comparison
    public static boolean isPalindrome2(String text,int start,int end){

        if(start>=end){
            return true;
        }

        if(text.charAt(start)!=text.charAt(end)){
            return false;
        }

        return isPalindrome2(text,start+1,end-1);
    }

    
    // Using character arrays and reverse string
    public static char[] reverseString(String text){

        int len=text.length();
        char[] reverse=new char[len];

        int index=0;
        for(int i=len-1;i>=0;i--){
            reverse[index++]=text.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome3(String text){
        char[] o=text.toCharArray();
        char[] reverse=reverseString(text);

        for(int i=0;i<o.length;i++){
            if(o[i]!=reverse[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the text:");
        String text=input.nextLine();

        boolean result1=isPalindrome1(text);
        boolean result2=isPalindrome2(text,0,text.length()-1);
        boolean result3=isPalindrome3(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("(Iterative): "+(result1?"Palindrome":"Not Palindrome"));
        System.out.println("(Recursive): "+(result2?"Palindrome":"Not Palindrome"));
        System.out.println("(Char Array): "+(result3?"Palindrome":"Not Palindrome"));

        input.close();
    }
}
