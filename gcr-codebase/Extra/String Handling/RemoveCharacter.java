import java.util.*;

public class RemoveCharacter{

	// Remove a Specific Character
	public static String removeChar(String s, char c){
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=c)
		sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.nextLine();
	System.out.println("enter character");
	String c=kb.nextLine();
	
	
	//calling method
	String res=removeChar(s,c.charAt(0));
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("After removing specific char "+res);
	
	kb.close();
	}
}