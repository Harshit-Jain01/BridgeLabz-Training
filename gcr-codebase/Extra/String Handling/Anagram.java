import java.util.*;

public class Anagram{

	// check if string are anagram
	public static boolean isAnagram(String s1, String s2){
		
		if(s1.length()!=s2.length())return false;
		int []arr=new int[26];
		int []brr=new int[26];
		for(int i=0;i<s1.length();i++){
		char c1=s1.charAt(i);
		char c2=s2.charAt(i);
		arr[c1-'a']++;
		brr[c2-'a']++;
		}
		for(int i=0;i<arr.length;i++){
		if(arr[i]!=brr[i])
		return false;
		}
		return true;
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter first String");
	String s1=kb.nextLine();
	System.out.println("enter second String");
	String s2=kb.nextLine();
	
	//calling method
	boolean res=isAnagram(s1,s2);
	
	//dispay result
	System.out.println(res?"It is Anagram":"It is not Anagram");
	
	kb.close();
	}
	
}