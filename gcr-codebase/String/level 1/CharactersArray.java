import java.util.Scanner;

public class CharactersArray{

	//return character array using String
	public static char [] characterUsingCharAt(String s1){
	
		char []arr=new char[s1.length()];
		for(int i=0;i<s1.length();i++){
		 arr[i]=s1.charAt(i);
		}
		
		return arr;
	}
	
	//return character array using String
	public static char [] characterUsingCharArray(String s1){
	
		char []arr=s1.toCharArray();
		
		return arr;
	}
	
	//compare two string
	public static boolean compareStringArray(char []a1,char []a2){
	
		if(a1.length!=a2.length)return false;
		
		for(int i=0;i<a1.length;i++){
		if(a1[i]!=a2[i])
		return false;
		}
		return true;
	}
	
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
		
		//take string as input
        System.out.print("Enter  string");
        String s1=input.next();
		
		//calling method
		char []arr1=characterUsingCharAt(s1);
		char []arr2=characterUsingCharArray(s1);
		 
		 //compare two array
		  System.out.println("first array ");
		  for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
			System.out.println();
		  System.out.println("second array ");
		  for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
		boolean flag=compareStringArray(arr1,arr2);
		 if(flag)
		  System.out.println("Array are same");
		  else  
		  System.out.println("Array are not same");

        input.close();
    }
}