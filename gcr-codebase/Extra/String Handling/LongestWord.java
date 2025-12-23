import java.util.*;

public class LongestWord{

	//finding longest word
	public static String longestWord(String s){
		
		String []words=s.trim().split("\\s+");
		int max=0;
		String res="";
		for(int i=0;i<words.length;i++){
			if(words[i].length()>max){
			res=words[i];
			max=words[i].length();
			}
		}
		
		return res;
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.nextLine();
	
	//calling method
	String res=longestWord(s);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("longest word "+res);
	
	kb.close();
	}

}