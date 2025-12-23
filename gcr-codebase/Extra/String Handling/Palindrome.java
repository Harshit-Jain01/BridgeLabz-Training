import java.util.*;

public class Palindrome{

	//checking palindrome
	public static boolean isPalindrome(String s){
		
		int n=s.length();
		int j=n-1;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(j--))
			return false;
		}
		return true;
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.next();
	
	//calling method
	boolean res=isPalindrome(s);
	
	//dispay result
	System.out.println(res?"It is palindrome":"It is not palindrome");
	
	
	

	}

}