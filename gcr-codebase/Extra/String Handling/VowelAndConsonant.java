import java.util.*;

public class VowelAndConsonant{

	//counting vowels and consonants
	public static int[] countVowelConsonant(String s){
		int vowel=0,consonant=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{	char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			vowel++;
			else if(c>=97 && c<=122)
			consonant++;
		}
		int []arr=new int[2];
		arr[0]=vowel;
		arr[1]=consonant;
		return arr;
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter String");
	String s=kb.next();
	
	//calling method
	int []res=countVowelConsonant(s);
	
	//dispay result
	System.out.println("Vowels "+res[0]);
	System.out.println("Consonants "+res[1]);
	
	

	}

}