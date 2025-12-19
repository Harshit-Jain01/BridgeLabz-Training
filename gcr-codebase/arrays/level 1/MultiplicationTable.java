import java.util.Scanner;

class MultiplicationTable{
   public static void main(String[] args) {

      // Create a Scanner Object and  taking number as input from user
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number");
      int number=input.nextInt();
      int []table=new int[10];


      //storing result of multiplication table 
      for(int i=0;i<table.length;i++){
      	table[i]=(i+1)*number;
      }


     //displaying the table
	 for(int i=0;i<table.length;i++){
      		System.out.println(number+"*"+(i+1)+"="+table[i]);
         }

	input.close();
	
     }
}