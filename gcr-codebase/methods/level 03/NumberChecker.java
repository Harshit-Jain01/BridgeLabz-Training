import java.util.Scanner;

class NumberChecker{

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

    //check duck number
    public static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0)
                return true;
        }
        return false;
    }

    //armstrong number
    public static boolean isArmstrong(int number,int[] digits){
        int l=digits.length;
        int sum=0;

        for(int i=0;i<digits.length;i++){
            int temp=1;
            for(int j=0;j<l;j++){
                temp*=digits[i];
            }
            sum+=temp;
        }
        return sum==number;
    }

    //largest and second largest
    public static void LargestAndSecondLargest(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<digits.length;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest && digits[i]<largest){
                secondLargest=digits[i];
            }
        }

        System.out.println("Largest digit:"+largest);
        System.out.println("Second largest digit:"+secondLargest);
    }

    //smallest and second smallest 
    public static void SmallestAndSecondSmallest(int[] digits){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<digits.length;i++){
            if(digits[i]<smallest){
                secondSmallest=smallest;
                smallest=digits[i];
            }else if(digits[i]<secondSmallest && digits[i]>smallest){
                secondSmallest=digits[i];
            }
        }

        System.out.println("Smallest digit:"+smallest);
        System.out.println("Second smallest digit:"+secondSmallest);
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        int[] digits=storeDigits(number);

        System.out.println("Count of digits:"+digits.length);

        if(isDuckNumber(digits))
            System.out.println(number+" is a Duck Number");
        else
            System.out.println(number+" is not a Duck Number");

        if(isArmstrong(number,digits))
            System.out.println(number+" is an Armstrong Number");
        else
            System.out.println(number+" is not an Armstrong Number");

        LargestAndSecondLargest(digits);
        SmallestAndSecondSmallest(digits);

        input.close();
    }
}
