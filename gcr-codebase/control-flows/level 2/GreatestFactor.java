import java.util.Scanner;
public class GreatestFactor{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int greatestFactor=1;
	
	   //finding the greatest factor of number
	   if(number<=0)
	   System.out.println("Not a valid input");
	   else{
		for(int i=number-1;i>1;i--){
	 	if(number%i==0){
		  greatestFactor=i;
		  break;
                 }
	      }
               System.out.println("greatestFactor is "+greatestFactor); 
	   }
      }
}