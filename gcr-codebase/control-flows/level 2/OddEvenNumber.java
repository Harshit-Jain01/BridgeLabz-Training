import java.util.Scanner;
public class OddEvenNumber{
    public static void main(String []args){
           //creating object of Scanner and taking number from user
	   Scanner input=new Scanner(System.in);
           int number=input.nextInt();

           //check for Natural Number
	   if(number<=0)
	   System.out.println("Not a Natural number");
           else{
           for(int i=1;i<=number;i++){
		if(i%2==0)
		System.out.println(i+" is even number");
		else
		System.out.println(i+" is odd number");
             }
          }
     }
}
	   
           
 
