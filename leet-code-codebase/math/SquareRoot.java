import java.util.Scanner;

public class SquareRoot{
    public static int mySqrt(int x){
        if(x==0)return 0;
        if(x==1)return 1;
        int left=1,right=x,ans=1;
        while(left<=right){
            int mid=(left+right)/2;
            if(mid==x/mid)
                return mid;
            else if(mid>x/mid)
                right=mid-1;
            else{
                left=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=sc.nextInt();
        System.out.println("Square root: "+mySqrt(x));
        sc.close();
    }
}
