import java.math.BigInteger;
import java.util.Scanner;

class LC415_AddString{
    public static String addStrings(String num1,String num2){
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger c=a.add(b);
        return String.valueOf(c);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number:");
        String num1=sc.nextLine();

        System.out.print("Enter second number:");
        String num2=sc.nextLine();

        String result=addStrings(num1,num2);
        System.out.println("Sum:"+result);

        sc.close();
    }
}
