import java.util.Scanner;

public class BusRouteTracker{
	
    public static void main(String[] args){
		
        Scanner input=new Scanner(System.in);
        int td=0;
        int distancePerStop=2;
        boolean journey=true;

        while(journey){
            td+=distancePerStop;
            System.out.println("Bus reached next stop.");
            System.out.println("Distance covered so far: "+td+" km");

            System.out.print("Do you want to get down(yes/no): ");
            String choice=input.next();

            if(choice.equalsIgnoreCase("yes")){
                journey=false;
            }
        }

        System.out.println("Passenger got down.");
        System.out.println("Total distance traveled: "+td);
        input.close();
    }
}
