import java.util.Scanner;
class ConvertKilometersToMiles{
    public static void main(String []args){
        //Create a variable km
	double km;
	// Creating Scanner Object to take user input
	Scanner kb = new Scanner(System.in);
	// taking input from user
	km=kb.nextDouble();
	// converting distance in miles
	double miles=km*0.6;
	// displaying the distance in miles for given km
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
  }
}