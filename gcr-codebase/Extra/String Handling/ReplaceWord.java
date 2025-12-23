import java.util.*;

public class ReplaceWord{

	// Replace word in sentence
	public static String replaceWord(String s,String word,String replace){
	
		StringBuilder sb=new StringBuilder();
		String []arr=s.split("\\s+");
		for(int i=0;i<arr.length;i++){
		if(word.equalsIgnoreCase(arr[i]))
		sb.append(replace);
		else
		sb.append(arr[i]);
		if(i<arr.length-1)
	    sb.append(" ");
		}
		
		return sb.toString();
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.nextLine();
	System.out.println("enter word to replace");
	String w=kb.nextLine();
	System.out.println("enter new word to place");
	String r=kb.nextLine();
	
	
	//calling method
	String res=replaceWord(s,w,r);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("After replace the word "+res);
	
	kb.close();
	}
}