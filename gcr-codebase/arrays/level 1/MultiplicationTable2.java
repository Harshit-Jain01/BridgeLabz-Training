import java.util.Scanner;

class MultiplicationTable2{
   public static void main(String[] args) {

      // Create a Scanner Object and  creating an array of integer
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number");
      int number=input.nextInt();
      int []multiplicationResult=new int[4];
     
     

     // assigning result of table to array
     int index=0;
     for(int i=6;i<=9;i++){
	multiplicationResult[index++]=number*i;
     }

	
     //displaying the result
     int j=0;
     for(int i=6;i<=9;i++) {
        System.out.println(number+"*"+i+"="+multiplicationResult[j++]);
     }

     input.close();
	
     }
}