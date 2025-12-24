import java.util.*;

public class Palindrome{

	//taking input
	public static String takeInput(){
		
		//taking input
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter string");
		String s=kb.next();
		
		return s;
	}
	
	// checking palindrome
	public static boolean isPalindrome(String s){
		
		int n=s.length();
		int j=n-1;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(j--))
			return false;
		}
		return true;
	}
	
	// displaying output
	public static void displayResult(boolean ans){
		
		System.out.println(ans?"It is palindrome":"It is not palindrome");
	}
	
	public static void main(String[]args){
	
	// calling method
	
	String s=takeInput();
	boolean result=isPalindrome(s);
	displayResult(result);
	
	}
	
}