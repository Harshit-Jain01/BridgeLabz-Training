import java.util.Scanner;

class PlusOne{
    public static int[] plusOne(int[] digits){
        int n=digits.length;
        int[] arr=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else
                digits[i]=0;
        }
        arr[0]=1;
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n=sc.nextInt();
        int[] digits=new int[n];
        System.out.println("Enter digits:");
        for(int i=0;i<n;i++)
            digits[i]=sc.nextInt();
        int[] result=plusOne(digits);
        System.out.print("Result: ");
        for(int x:result)
            System.out.print(x+" ");
        sc.close();
    }
}
