import java.util.*;

public class RemoveDuplicate{

	//remove all duplicate characters
	public static String removeDup(String s){
		
		boolean []flag=new boolean[26];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(flag[c-'a']==false)
			{sb.append(c);
			flag[c-'a']=true;}
		}
		return sb.toString();
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.next();
	
	//calling method
	String res=removeDup(s);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("After removing duplicates "+res);
	
	kb.close();
	}

}