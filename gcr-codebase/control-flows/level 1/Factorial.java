import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
           int factorial=1;
		
	   if(number<0)
	   System.out.println("You entered negative number");
	   else{

           //computing the factorial using while loop
           while(number>1){
           factorial*=number;
           number--;
             }

	   // displaying result of factorial
           System.out.println("Factorial is "+factorial);

           }
           
      }
}
