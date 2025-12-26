import java.util.Scanner;
public class FitnessTracker{
    public static void main(String []args){
         
		 //creating object of Scanner and taking weight and height as input from user
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter weight and height");
           double weight=input.nextDouble();
	    double height=input.nextDouble();

	  //calculating BMI
	  double bmi=weight/(height*height);

	  //displaying the BMI status
	  if(bmi<=18.4)
	  System.out.println("Underweight");
	  else if(bmi>=18.5 && bmi<=24.9)
	  System.out.println("Normal");
	  else if(bmi>=25 && bmi<=39.9)
	  System.out.println("Overweight");
	 

	 input.close();
     }
}