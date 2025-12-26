import java.util.Scanner;

class SumZero{

    // method to generate array whose sum is zero
    public static int[] sumZero(int n){

        int[] arr=new int[n];
        int k=1;

        for(int i=0;i<n-1;i+=2){
            arr[i]=k;
            arr[i+1]=-k;
            k++;
        }

        if(n%2!=0)
            arr[n-1]=0;

        return arr;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        // taking input
        System.out.println("Enter n");
        int n=input.nextInt();

        // calling method
        int[] result=sumZero(n);

        // displaying result
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");

        input.close();
    }
}
