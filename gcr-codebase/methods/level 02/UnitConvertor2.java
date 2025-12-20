import java.util.*;
class UnitConvertor2{

public static double convertYardsToFeet(double yards){
 
	 //  yards to feet 
	double yards2feet = yards*3;
		return yards2feet;
   }
  
 public static double convertFeetToYards(double feets){
 
	 //  feet to yards
	double feet2yards = 0.333333*feets;
		return feet2yards;
   }
   
   public static double convertMetersToInch(double meters){
 
	 // MetersToInch
	double meters2inches = 39.3701*meters;
		return meters2inches ;
   }
   
    public static double convertInchToMeter(double inches){
 
	   // InchToMeter
	    double inches2meters = 0.0254*inches;
	       return inches2meters;
		
   }
   
    public static double convertInchesToCentimeters(double inches){
 
	 // convert inches to centimeters
	 double inches2cm = 2.54*inches;
		return inches2cm;
   }
   
   public static void main(String []args){
   
    Scanner input = new Scanner(System.in);

        // Yards to Feet
        System.out.print("Enter yards: ");
        double yards = input.nextDouble();
        System.out.println("Feet = " + convertYardsToFeet(yards));

        // Feet to Yards
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.println("Yards = " + convertFeetToYards(feet));

        // Meters to Inches
        System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        System.out.println("Inches = " + convertMetersToInch(meters));

        // Inches to Meters
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        System.out.println("Meters = " + convertInchToMeter(inches));

        // Inches to Centimeters
        System.out.print("Enter inches: ");
        double inches2 = input.nextDouble();
        System.out.println("Centimeters = " + convertInchesToCentimeters(inches2));

        input.close();
	  
	  }
   }