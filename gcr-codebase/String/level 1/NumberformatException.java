import java.util.Scanner;

public class NumberformatException{

    // generate NumberFormatException
    public static void generateException(String s) {
		
			int i=Integer.parseInt(s);
		}

    // handle NumberFormatException

    public static void handleException(String s) {
      
        try {
		
				int i=Integer.parseInt(s);		
			}
		catch (NumberFormatException e) {
            System.out.println(" NumberFormatException caught");
            System.out.println("Error Message: " + e.getMessage());
        }
		 
    }

    public static void main(String[] args) {
		
		//take input from user
		Scanner input=new Scanner(System.in);
		String s=input.next();
		
        // Calling method
        System.out.println("Generating NumberFormatException:");
		try{
        generateException(s);
		}catch(NumberFormatException ex){
        handleException(s);
		}
		
		input.close();
	   
    }
}
