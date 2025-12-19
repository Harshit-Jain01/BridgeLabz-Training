import java.util.Scanner;

class SumOfNumbers{
   public static void main(String[] args) {

      // Create a Scanner Object and  creating an array of double
      Scanner input = new Scanner(System.in);
      double []number=new double[10];
      double total=0.0;
      int index=0;
     

     // assigning values to array
     while(true){
	 if(index==10)
	   break;
	 System.out.println("Enter a number");
	 double num=input.nextDouble();
	 if(num<=0)
	 break;
	 else
	 number[index]=num;
	 index++;
	}


     //sum of numbers
	 for(int i=0;i<index;i++){
      	    total+=number[i];
         }

     
     //displaying sum
	System.out.println("Total sum is "+total);

	input.close();
	
     }
}