import java.util.Scanner;

class EvenOddArray{
   public static void main(String[] args) {

      // Create a Scanner Object and taking number from user
      Scanner input = new Scanner(System.in);
      System.out.println("enter number");
      int number=input.nextInt();

      if(number<=0){
	  System.out.println("Not a valid number");
	  System.exit(0);
      }
	
      //creating odd and even array
	int evenindex=0,oddindex=0;
	int size=(number/2) + 1;
        int []odd=new int[size];
	int []even=new int[size];
           for(int i=1;i<=number;i++){
            if(i%2==0)
	      even[evenindex++]=i;
	    else 
	      odd[oddindex++]=i;
          }


      //displaying odd and even arrays
       System.out.println("Even Array");
      for(int i=0;i<evenindex;i++)
	System.out.println(even[i]);
       System.out.println("Odd Array");
      for(int i=0;i<oddindex;i++)
	System.out.println(odd[i]);

      input.close();
 
   }
}