import java.util.*;
class UnitConvertor{

  //creating method to find smallest and largest of the three numbers

 public static double convertKmToMiles(double km){
 
	 // convertKmToMiles
	 double km2miles = 0.621371*km;
		return km2miles;
   }
  
  public static double convertMilesToKm(double miles){
 
	 // convertKmToMiles
	double miles2km = 1.60934*miles;
		return miles2km;
   }
   
   public static double convertMetersToFeet(double meters){
 
	 // convertMeterToFeet
	double  meters2feet = 3.28084*meters;
		return meters2feet;
   }
   
    public static double convertFeetToMeter(double feet){
 
	 // convertFeetToMeter
	double feet2meters = 0.3048*feet;
		return feet2meters;
   }
   
   public static void main(String []args){
   
     //taking input for km,miles,feet,meters
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter km");
	  double km=input.nextDouble();
	  System.out.println("Enter miles");
	  double miles=input.nextDouble();
	  System.out.println("Enter feet");
	  double feet=input.nextDouble();
	    System.out.println("Enter meters");
	  double meters=input.nextDouble();
	  
	  //calling method
	double result1=convertKmToMiles(km);
	double result2=convertMilesToKm(miles);
	double result3=convertMetersToFeet(meters);
	double result4=convertFeetToMeter(feet);
	
	//displaying result
	System.out.println("Km to Miles: " + result1);
    System.out.println("Miles to Km: " + result2);
    System.out.println("Meters to Feet: " + result3);
    System.out.println("Feet to Meters: " + result4);

	 
	  input.close();
	  
	  }
   }