import java.util.*;

public class ReverseString{

	//reverse a String
	public static String reverseStr(String s){
		
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.next();
	
	//calling method
	String res=reverseStr(s);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("Reverse string "+res);
	
	

	}

}