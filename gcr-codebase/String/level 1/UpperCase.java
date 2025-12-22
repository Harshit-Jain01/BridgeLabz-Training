import java.util.Scanner;

public class UpperCase{

	//convert lowercase to uppercase 
	public static String upperCase(String s1){
	
		String ans="";
		for(int i=0;i<s1.length();i++){
		 char c=s1.charAt(i);
		 if(c>=97 && c<=122)
		 c=(char)(c-32);
		 ans+=c;
		}
		
		return ans;
	}
	
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
        System.out.print("Enter  string");
        String s1=input.nextLine();
		
		//calling method
		String res1=upperCase(s1);
		String res2=s1.toUpperCase();
		
		 
		 //compare two string
		  System.out.println("first string ");
			System.out.println(res1);
		  System.out.println("second string");
		System.out.println(res2);
		boolean flag=compareString(res1,res2);
		 if(flag)
		  System.out.println("String are same");
		  else  
		  System.out.println("String are not same");

        input.close();
    }
}