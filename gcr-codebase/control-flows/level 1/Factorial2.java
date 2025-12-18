import java.util.Scanner;
public class Factorial2{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
           int factorial=1;
		
	   if(number<0)
	   System.out.println("You entered negative number");
	   else{

           //computing the factorial using while loop
           for(int i=number;i>1;i--){
           factorial*=i;
             }

	   // displaying result of factorial
           System.out.println("Factorial is "+factorial);

           }
           
      }
}
