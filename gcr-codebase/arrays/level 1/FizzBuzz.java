import java.util.Scanner;

class FizzBuzz{
   public static void main(String[] args) {

     // Create a Scanner Object and taking number from user and
      Scanner input = new Scanner(System.in);
      System.out.println("enter number");
      int number=input.nextInt();

     
     if(number<=0){
	System.out.println("Not a Valid number") ;
	System.exit(0);
     }
      

     //creating String array
	String []arr=new String[number];
	int index=0;
	for(int i=1;i<=number;i++){
	if(i%3==0 && i%5==0)
	arr[index]="FizzBuzz";
	else if(i%3==0)
	  arr[index]="Fizz";
	else if(i%5==0)
	  arr[index]="Buzz";
	else 
          arr[index]=String.valueOf(i);
        index++;
	}

	
	//displaying position
	for(int i=0;i<number;i++)
	   System.out.println("Position "+(i+1)+"="+arr[i]);
     
	input.close();

    }
}
     
