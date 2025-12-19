import java.util.Scanner;

class VotingEligibility{
   public static void main(String[] args) {
      // Create a Scanner Object and  creating an integer array of age
      Scanner input = new Scanner(System.in);
      int []age=new int[10];
     

      //taking age as input 
      for(int i=0;i<age.length;i++){
	System.out.println("Enter a age:");
      	age[i]=input.nextInt();
      }
      

      //checking if student is eligible to vote or not
      for(int i=0;i<age.length;i++){
      	if(age[i]<0)
	   System.out.println("invalid age");
	else if(age[i]>=18)
	   System.out.println(" The student with the age "+age[i]+" can vote.");
	else
	   System.out.println(" The student with the age "+age[i]+" cannot vote.");
	}

	input.close();
	System.exit(0);

      }
} 
