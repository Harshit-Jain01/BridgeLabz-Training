import java.util.*;
class RoundsInPark{

  //creating method to calculate total rounds
   public  int totalRounds(int perimeter ){
     int rounds=5000/perimeter;
     return rounds;
   }
   
   public static void main(String []args){
   
     //taking input for 3 sides of a triangle 
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter length of first side in meters");
	 int first=input.nextInt();
	 System.out.println("Enter length of second side in meters");
	 int second=input.nextInt();
	 System.out.println("Enter length of third side in meters");
	 int third=input.nextInt();
	 
	 //calculate total perimeter
	 int perimeter=first+second+third;
	 
	 //creating object of class 
	 RoundsInPark obj=new RoundsInPark();
	 int totalRounds=obj.totalRounds(perimeter);
	 
	 //displaying result
	 System.out.println("the number of rounds "+totalRounds);
	 
	 input.close();
	 
	 }
}
	 