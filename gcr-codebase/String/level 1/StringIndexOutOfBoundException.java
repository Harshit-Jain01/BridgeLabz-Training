import java.util.Scanner;

public class StringIndexOutOfBoundException{

    // generate  StringIndexOutOfBoundsException
    public static void generateException(String s) {
		
		int l=s.length();
        System.out.println(s.charAt(l)); 
		}

    // handle  StringIndexOutOfBoundsException
    public static void handleException(String s) {
      
        try {
            int l=s.length();
        System.out.println(s.charAt(l)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		
		//take input from user
		Scanner input=new Scanner(System.in);
		String s=input.next();
		
        // Calling method
        System.out.println("Generating NullPointerException:");
		try{
        generateException(s);
		}catch(StringIndexOutOfBoundsException ex){
        handleException(s);
		}
       
    }
}
