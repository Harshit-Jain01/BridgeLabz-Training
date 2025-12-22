import java.util.Scanner;

public class IllegalargumentException{

    // generate   IllegalArgumentException

    public static void generateException(String s) {
		
        System.out.println(s.substring(3,1)); 
		}

    // handle   IllegalArgumentException

    public static void handleException(String s) {
      
        try {
        System.out.println(s.substring(3,1));
        } catch (IllegalArgumentException e) {
            System.out.println(" IllegalArgumentException caught");
            System.out.println("Error Message: " + e.getMessage());
        }
		 catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
            System.out.println("Error Message: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
		
		//take input from user
		Scanner input=new Scanner(System.in);
		String s=input.next();
		
        // Calling method
        System.out.println("Generating  IllegalArgumentException:");
		try{
        generateException(s);
		}catch(IllegalArgumentException ex){
        handleException(s);
		}
		catch(RuntimeException ex){
        handleException(s);
		}
       
    }
}
