import java.util.Scanner;

class NumberChecker2{

    //count of digits
    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }

    //store digits in array
    public static int[] storeDigits(int number){
        int count=countDigits(number);
        int[] digits=new int[count];
        int index=count-1;

        while(number!=0){
            digits[index--]=number%10;
            number/=10;
        }
        return digits;
    }

    //sum of digits 
    public static int sumOfDigits(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=digits[i];
        }
        return sum;
    }

    //sum of squares of digits
    public static int sumOfSquares(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum+=Math.pow(digits[i],2);
        }
        return sum;
    }

    //check Harshad number
    public static boolean isHarshad(int number,int[] digits){
        int sum=sumOfDigits(digits);
        return number%sum==0;
    }

    //frequency count
    public static int[][] digitFrequency(int[] digits){
        int[][] freq=new int[10][2];

        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }

        for(int i=0;i<digits.length;i++){
            freq[digits[i]][1]++;
        }

        return freq;
    }

    public static void main(String[] args){
		
		//take input
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

		//calling methods and display results
		int count=countDigits(number);
        int[] digits=storeDigits(number);

        System.out.println("Count of digits:"+count);
        System.out.println("Sum of digits:"+sumOfDigits(digits));
        System.out.println("Sum of squares of digits:"+sumOfSquares(digits));

        if(isHarshad(number,digits))
            System.out.println(number+" is a Harshad Number");
        else
            System.out.println(number+" is not a Harshad Number");

        int[][] frequency=digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for(int i=0;i<frequency.length;i++){
            if(frequency[i][1]>0)
                System.out.println("Digit:"+frequency[i][0]+" Frequency:"+frequency[i][1]);
        }

        input.close();
    }
}
