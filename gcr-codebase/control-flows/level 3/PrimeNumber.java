import java.util.Scanner;
public class PrimeNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number as input from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();
	   Boolean isPrime=true;
	
           //checking if number is prime or not
	   if(number<=1)
           isPrime=false;
	   else{
	    for(int i=2;i<number;i++){
	      if(number%i==0)
	      {
              isPrime=false;
	      break;
              }
            }
	  }
	   System.out.println(isPrime?"it is prime":"it is not prime");
	   input.close();
    }
}