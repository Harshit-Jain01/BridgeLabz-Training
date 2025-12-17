import java.util.Scanner;
public class DistanceInYardsAndMiles{
    public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking distance in feet
	double distanceInFeet=kb.nextDouble();
	
	//Converting distance in yards and miles
	double distanceInYards=distanceInFeet/3;
	double distanceInMiles=distanceInYards/1760;

	//displaying the distance in yards and miles
	System.out.println("The distance in yards is "+distanceInYards+" while the distance in miles is "+distanceInMiles);
      }
}
	
