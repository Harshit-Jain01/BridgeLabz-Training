import java.util.*;
class HandShakes{

  //creating method to calculate maximum handshakes possible
   public  int totalHandshakes(int students){
       int handshakes=(students*(students-1))/2;
     return handshakes;
   }
   
   public static void main(String []args){
   
     //taking input for number of students
	  Scanner input =new Scanner(System.in);
      System.out.println("Enter total students");
	 int numberOfStudents=input.nextInt();
	 
	 //creating object of class and calling method
	 HandShakes object=new HandShakes();
	 int totalHandshakes=object.totalHandshakes(numberOfStudents);
	 
	 //displaying result
	 System.out.println("Toatal handshakes "+totalHandshakes);
	 
	 input.close();
	 
	 }
}
	 