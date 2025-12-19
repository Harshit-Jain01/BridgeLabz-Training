import java.util.*;

public class BMI{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    //taking number of person by the user and creating weight and height array
		System.out.println("enter number of person");
		int NumberOfPerson=input.nextInt();
		double []weight=new double[NumberOfPerson];
		double []height=new double[NumberOfPerson];
		
		//taking weight and height from user
		for(int i=0;i<NumberOfPerson;i++){
		  System.out.println("enter weight and height of person");
		   weight[i]=input.nextDouble();
		   height[i]=input.nextDouble();
		}
		
		//finding the BMI and storing in bmi array and storing status
		double []bmi=new double[NumberOfPerson];
		String []status=new String[NumberOfPerson];

		for(int i=0;i<NumberOfPerson;i++){
			bmi[i]=weight[i]/( height[i]* height[i]);
			if(bmi[i]<=18.4)
			  status[i]="UnderWeight";
		        else if(bmi[i]>=18.5 && bmi[i]<=24.9)
			  status[i]="Normal";
			else if(bmi[i]>=25 && bmi[i]<=39.9)
			  status[i]="OverWeight";
			else
			  status[i]="Obese";   
		}
		
		//Display the height, weight, BMI, and weight status of each person
		for(int i=0;i<NumberOfPerson;i++){
		   System.out.println("height:" +height[i]+" ,weight:"+weight[i]+" ,BMI:"+bmi[i]+" status:"+status[i]);
		}
		
		input.close();
		
	}
}