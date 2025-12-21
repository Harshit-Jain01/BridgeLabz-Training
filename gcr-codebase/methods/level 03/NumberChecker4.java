import java.util.Scanner;

class NumberChecker4{

    //prime number
    public static boolean isPrime(int number){
        if(number<=1)
            return false;
		else if(number==2)
		return true;
		else if(number%2==0)
		return false;
		
		for(int i=3;i*i<=number;i+=2){
		if(number%i==0)
		return false;
		}
		return true;
    }

    //neon number
    public static boolean isNeon(int number){
        int square=number*number;
        int sum=0;

        while(square!=0){
            sum+=square%10;
            square/=10;
        }
        return sum==number;
    }

    //spy number
    public static boolean isSpy(int number){
        int sum=0;
        int product=1;
        int temp=number;

        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }
        return sum==product;
    }

    //automorphic number
    public static boolean isAutomorphic(int number){
        int square=number*number;
        int temp=number;

        while(temp!=0){
            if(square%10!=temp%10)
                return false;
            square/=10;
            temp/=10;
        }
        return true;
    }

    //buzz number
    public static boolean isBuzz(int number){
        if(number%7==0 || number%10==7)
            return true;
        return false;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        if(isPrime(number))
            System.out.println(number+" is a Prime Number");
        else
            System.out.println(number+" is not a Prime Number");

        if(isNeon(number))
            System.out.println(number+" is neon umber");
        else
            System.out.println(number+" not a neon number");

        if(isSpy(number))
            System.out.println(number+" is a spy number");
        else
            System.out.println(number+" is not a Spy number");

        if(isAutomorphic(number))
            System.out.println(number+" is an automorphic num");
        else
            System.out.println(number+" is not an automorphic num");

        if(isBuzz(number))
            System.out.println(number+" is a buzz number");
        else
            System.out.println(number+" is not a buzz number");

        input.close();
    }
}
