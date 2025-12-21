import java.util.Scanner;

class NumberChecker3{

    //count digits
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

    //reverse digits array
    public static int[] reverseArray(int[] digits){
        int[] rev=new int[digits.length];
        int j=0;

        for(int i=digits.length-1;i>=0;i--){
            rev[j++]=digits[i];
        }
        return rev;
    }

    //compare two arrays
    public static boolean compareArrays(int[] a,int[] b){
        if(a.length!=b.length)
            return false;

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }

    //palindrome number
    public static boolean isPalindrome(int[] digits){
        int[] reversed=reverseArray(digits);
        return compareArrays(digits,reversed);
    }

    //duck number 
    public static boolean isDuckNumber(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0)
                return true;
        }
        return false;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        int[] digits=storeDigits(number);

        System.out.println("Count of digits:"+countDigits(number));

        int[] reversed=reverseArray(digits);

        System.out.print("Digits:");
        for(int i=0;i<digits.length;i++)
            System.out.print(digits[i]+" ");
        System.out.println();

        System.out.print("Reversed Digits:");
        for(int i=0;i<reversed.length;i++)
            System.out.print(reversed[i]+" ");
        System.out.println();

        if(isPalindrome(digits))
            System.out.println(number+" is a Palindrome Number");
        else
            System.out.println(number+" is not a palindrome");

        if(isDuckNumber(digits))
            System.out.println(number+" is duck number");
        else
            System.out.println(number+" is not a duck number");

        input.close();
    }
}
