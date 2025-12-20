import java.util.*;
class WindChillTemperature{

  //creating method to find the wind chill temperature

public double calculateWindChill(double temp, double windSpeed){
	
	//calculating windChill
     double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * (Math.pow(windSpeed,0.16));
	 
	 return windChill;   
   }
   
   public static void main(String []args){
   
     //taking input for   temperature and wind speed
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter temperature");
	  double temperature=input.nextDouble();
	  System.out.println("Enter windSpeed");
	  double windSpeed=input.nextDouble();
	 
	  //creating object and calling method
	  WindChillTemperature wind=new WindChillTemperature();
	  double result=wind.calculateWindChill(temperature,windSpeed);
	  
	  //display wind chill temperature
	  System.out.println("wind chill temperature "+result);
	  
	  input.close();
	  
	  }
   }