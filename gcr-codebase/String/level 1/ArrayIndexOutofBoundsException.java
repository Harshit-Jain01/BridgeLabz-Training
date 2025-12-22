import java.util.Scanner;

public class ArrayIndexOutofBoundsException{

    // generate ArrayIndexOutofBoundsException
      public static void generateException(int []arr){
				
				int length=arr.length;
				int x=arr[length];
			
		}

    // handle ArrayIndexOutofBoundsException
    public static void handleException(int []arr){
      
        try {
				int length=arr.length;
				int x=arr[length];	
			}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutofBoundsException caught");
            System.out.println("Error Message: " + e.getMessage());
        }
		 
    }

    public static void main(String[] args) {
		
		//take input from user
		Scanner kb=new Scanner(System.in);
		int []arr=new int[4];
		for(int i=0;i<4;i++)
		 arr[i]=kb.nextInt();
		
        // Calling method
        System.out.println("Generating ArrayIndexOutofBoundsException:");
		try{
        generateException(arr);
		}catch(ArrayIndexOutOfBoundsException ex){
         handleException(arr);
		}
		
		kb.close();
	   
    }
}
