import java.math.BigInteger;
import java.util.Scanner;

class LC43_MultiplyString{

    public static String multiply(String num1,String num2){
        BigInteger bg1=new BigInteger(num1);
        BigInteger bg2=new BigInteger(num2);
        BigInteger ans=bg1.multiply(bg2);
        return String.valueOf(ans);
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter first number:");
        String num1=kb.nextLine();

        System.out.println("Enter second number:");
        String num2=kb.nextLine();

        String result=multiply(num1,num2);
        System.out.println("Product: "+result);

        kb.close();
    }
}
