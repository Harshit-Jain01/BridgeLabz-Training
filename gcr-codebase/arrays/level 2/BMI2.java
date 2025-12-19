import java.util.*;

public class BMI2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    //taking number of person by the user and Create a multi-dimensional array to store weight, height and BMI
		int number=input.nextInt();
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		
		//Take input for weight and height 
		    for (int i = 0; i < number; i++) {
               System.out.println("\nPerson " + (i + 1));
			      
				  do {
                   System.out.print("Enter weight");
                   personData[i][0] = input.nextDouble();
                   if (personData[i][0] <= 0) {
                     System.out.println("Please re-enter weight");
                     }
                   } while (personData[i][0] <= 0);
				   
			do {
                    System.out.print("height");
                    personData[i][1] = input.nextDouble();
                    if (personData[i][1] <= 0) {
                       System.out.println("Height must be positive. Please re-enter.");
                     }
                    } while (personData[i][1] <= 0);
					
		   // Calculate BMI
                       personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
					   
			//weight status
                     double bmi = personData[i][2];
                     if (bmi < 18.5) {
                        weightStatus[i] = "Underweight";
                     } else if (bmi < 25) {
                        weightStatus[i] = "Normal";
                     } else if (bmi < 30) {
                        weightStatus[i] = "Overweight";
                      } else {
                         weightStatus[i] = "Obese";
                        }
            }
 
      // displaying result
              for (int i = 0; i < number; i++) {
       		     System.out.println("Person " + (i + 1));
       		     System.out.println("Weight" + personData[i][0]);
        	     System.out.println("Height" + personData[i][1]);
          	     System.out.printf("BMI: %.2f\n", personData[i][2]);
       		     System.out.println("Status: " + weightStatus[i]);
      		      System.out.println();
         	  }
 
        input.close();
    }
}