import java.util.*;

public class CompareString{

	// compare two strings lexicographically
	public static void compareString(String s1, String s2){
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.equals(s2)){
		System.out.println("String are same");
		return;
		}
		int min=Math.min(s1.length(),s2.length());
		for(int i=0;i<min;i++){
		char c1=s1.charAt(i);
		char c2=s2.charAt(i);
		if(c1>c2)
		{
		System.out.println(s2+" comes before "+s1);
		return;
		}
		else if(c2>c1){
		System.out.println(s1+" comes before "+s2);
		return;	
		}
		}
		if(s1.length()<s2.length())
            System.out.println(s1+" comes before "+s2);
        else
            System.out.println(s2+" comes before "+s1);
	}
	
	public static void main(String[]args){
	
	//taking String input
	Scanner kb=new Scanner(System.in);
	System.out.println("enter first String");
	String s1=kb.nextLine();
	System.out.println("enter second String");
	String s2=kb.nextLine();
	
	//calling method
	compareString(s1,s2);
	
	kb.close();
	}
	
}