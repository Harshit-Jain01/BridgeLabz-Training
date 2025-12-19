import java.util.*;

public class ReverseNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    //taking number by the user 
		int number=input.nextInt();
		int temp=number;
		
		//finding the total digits in number
		int count=0;
		while(temp!=0){
		count++;
		temp/=10;
		}
		
		//creating an array and storing the number
		int []arr=new int[count];
		int j=count-1;
		while(number!=0){
		int digit=number%10;
		arr[j--]=digit;
		number/=10;
		}
		
		//displaying array in reverse order
		for(int i=arr.length-1;i>=0;i--){
		System.out.print(arr[i]);
		}
		
		input.close();
	}
}