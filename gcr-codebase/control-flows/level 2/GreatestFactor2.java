import java.util.Scanner;
public class GreatestFactor2{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   int greatestFactor=1;
	
	   //finding the greatest factor of number
	   if(number<=0)
	   System.out.println("Not a valid input");
	   else{
		int counter=number-1;
		while(counter>1){
	 	if(number%counter==0){
		  greatestFactor=counter;
		  break;
                 }
		counter--;
	      }
               System.out.println("greatestFactor is "+greatestFactor); 
	   }
      }
}