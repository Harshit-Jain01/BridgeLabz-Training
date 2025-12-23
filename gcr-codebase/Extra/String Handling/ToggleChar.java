import java.util.*;

public class ToggleChar{

	//toggling the character
	public static String toggle(String s){
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		if(c>='a' && c<='z')
		sb.append((char)(c-32));
		else
		sb.append((char)(c+32));
		}
		return sb.toString();
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.nextLine();
	
	
	//calling method
	String res=toggle(s);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("After toggling "+res);
	
	kb.close();
	}

}