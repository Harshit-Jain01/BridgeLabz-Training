import java.util.*;

public class FirstAndSecondLargest2{
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

		//taking number  by the user  and declaring array of int
		int number=input.nextInt();
		int maxDigit=10;
		int []arr=new int[maxDigit];
		int index=0;
		
		//adding digit to array
		   while(number!=0){
			if(index==maxDigit)
			{
			maxDigit+=10;
			int []temp=new int[maxDigit];
			System.arraycopy(arr,0,temp,0,index);
			arr=temp;
		        }
		    int digit=number%10;
		    arr[index++]=digit;
		    number/=10;
		  }
		
		//finding the largest and 2nd largest element
		int largest=0,secLargest=0;
		for(int i=0;i<index;i++){
		    if(arr[i]>largest){
			   secLargest = largest;
			   largest=arr[i];
			   }
			else if(secLargest<arr[i] && arr[i]<largest)
			   secLargest=arr[i];
		}
		
		//displaying the result
		System.out.println("largest "+largest);
		System.out.println("secLargest "+secLargest);
		
		input.close();

	}
}	