import java.util.*;
class SimpleInterest{

  //creating method to calculate simple Interest
   public  double calculateSimpleIntereset(double principal, double rate, double time){
       double calculateSimpleInterest= (principal * rate * time)/100;
     return calculateSimpleInterest;
   }
   public static void main(String []args){
   
     //taking input from the user for principle, rate, and time
      Scanner input =new Scanner(System.in);
     System.out.println("Enter principal :");
     double principal=input.nextDouble();
      System.out.println("Enter Rate :");
     double rate= input.nextDouble();
       System.out.println("Enter Time :");
     double time= input.nextDouble();
	 
	 //creating object of class
      SimpleInterest obj= new SimpleInterest();
      double result=obj. calculateSimpleIntereset(principal,rate,time);
      
    //displaying the simpleInterest
     System.out.println("The Simple Interest is "+result+" "+"for Principal" +principal+","+"Rate Of Interest"+" "+rate+" "+"and Time"+" "+time);
     
     input.close();
     }
 }