import java.util.Scanner;

class ClimbingStair{

    public static int climbStairs(int n){
	
        if(n==1)return 1;
        if(n==2)return 2;
        int first=1,second=2,current=0;
        for(int i=3;i<=n;i++){
            current=first+second;
            first=second;
            second=current;
        }
        return current;
    }
	
    public static void main(String[] args){
	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of stairs: ");
        int n=sc.nextInt();
        System.out.println("Ways to climb "+n+" stairs: "+climbStairs(n));
        sc.close();
    }
}
