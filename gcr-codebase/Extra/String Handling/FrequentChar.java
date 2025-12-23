import java.util.*;

public class FrequentChar{

	//finding the frequent character
	public static char frequentChar(String s){
		
		int []arr=new int[26];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)-97]++;
		}
		int max=0;
		char res=s.charAt(0);
		for(int i=0;i<26;i++){
			if(max<arr[i]){
			res=(char)('a'+i);
			max=arr[i];
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
	char res=frequentChar(s);
	
	//dispay result
	System.out.println("Original String "+s);
	System.out.println("Most frequent char "+res);
	
	kb.close();
	}
}