import java.util.*;

public class HappyNumber{
    public static int squareDigSum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=(d*d);
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        if(n<10)
            n=n*n;
        int i=1;
        while(n>=10){
            int k=squareDigSum(n);
            if(i==1&&k<10){
                k=squareDigSum(k*k);
                i++;
            }
            n=k;
        }
        return n==1;
    }
    public static void main(String[] args){
        int n=19;
        boolean result=isHappy(n);
        if(result)
            System.out.println(n+" is a Happy Number");
        else
            System.out.println(n+" is NOT a Happy Number");
    }
}
