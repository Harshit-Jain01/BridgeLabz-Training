import java.util.Scanner;

class NumberChecker5{

    //check perfect number
    public static boolean isPerfect(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                sum+=i;
        }
        return sum==number;
    }

    //abundant number
    public static boolean isAbundant(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                sum+=i;
        }
        return sum>number;
    }

    //deficient number
    public static boolean isDeficient(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                sum+=i;
        }
        return sum<number;
    }

    //strong number
    public static boolean isStrong(int number){
        int sum=0;
        int temp=number;

        while(temp!=0){
            int digit=temp%10;
            int fact=1;

            for(int i=1;i<=digit;i++){
                fact*=i;
            }

            sum+=fact;
            temp/=10;
        }
        return sum==number;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        if(isPerfect(number))
            System.out.println(number+" is a perfect number");
        else
            System.out.println(number+" is not a perfect number");

        if(isAbundant(number))
            System.out.println(number+" is an abundant ");
        else
            System.out.println(number+" is not an abundant");

        if(isDeficient(number))
            System.out.println(number+" is a deficient");
        else
            System.out.println(number+" is not a deficient");

        if(isStrong(number))
            System.out.println(number+" is a Strong Number");
        else
            System.out.println(number+" is not a Strong Number");

        input.close();
    }
}
