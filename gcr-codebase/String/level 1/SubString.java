import java.util.Scanner;

public class SubString{

	//create two string using charAt method
	public static String createSubStringUsingCharAt(String s1,int s,int e){
	
		String result="";
		for(int i=s-1;i<e;i++){
		result+=s1.charAt(i);
		}
		
		return result;
	}
	
	//create two string using substring
	public static String createSubString(String s1,int s,int e){
	
		String result=s1.substring(s-1,e);
		return result;
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
        String s1=input.next();
		 System.out.print("Enter start index ");
        int  start=input.nextInt();
		 System.out.print("Enter end index ");
        int  end=input.nextInt();
		
		
		//calling method
		String result1=createSubStringUsingCharAt(s1,start,end);
		String result2=createSubString(s1,start,end);
		 
		 //compare two string
		  System.out.println("result1 "+result1);
		   System.out.println("result2 "+result2);
		  
		boolean flag=compareString(result1,result2);
		 if(flag)
		  System.out.println("subString are same");
		  else  
		  System.out.println("subString are not same");

        input.close();
    }
}