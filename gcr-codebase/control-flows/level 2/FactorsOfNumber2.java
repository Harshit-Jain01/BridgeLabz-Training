import java.util.Scanner;
public class FactorsOfNumber2{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	
	   //finding the factor of number
	   if(number<=0)
	   System.out.println("Not a valid input");
	   else{
		System.out.print("Factors are : ");
	        int i=1;
		while(i<=number){
	 	if(number%i==0)
		System.out.print(i+" ");
		i++;
		    }
               }
        }
}