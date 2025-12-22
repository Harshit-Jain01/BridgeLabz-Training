import java.util.Scanner;

public class CompareString{

	//compare two string
	public static boolean compareString(String s1,String s2){
	
		if(s1.length()!=s2.length())return false;
		
		for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)!=s2.charAt(i))
		return false;
		}
		return true;
	}
	


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
		
		//take string as input
        System.out.print("Enter first string");
        String s1=input.next();
		 System.out.print("Enter second string");
        String s2=input.next();
		
		//calling method
		System.out.println("result by user-defined method");
		boolean result=compareString(s1,s2);
		 System.out.println(result?"String are same":"String are not same");
		 
		 //using built in method
		 System.out.println("result by built-in method");
		 if(s1.equals(s2))
		  System.out.println("String are same");
		  else  
		  System.out.println("String are not same");

        input.close();
    }
}