import java.util.Scanner;

class Factors{

    //finding factors and return as array
    public static int[] findFactors(int number){
        int count=0;

        for(int i=1;i<=number;i++){
            if(number%i==0)
                count++;
        }

        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)
                factors[index++]=i;
        }

        return factors;
    }

    //greatest factor
    public static int greatestFactor(int[] factors){
        int max=factors[0];
        for(int i=1;i<factors.length;i++){
            if(factors[i]>max)
                max=factors[i];
        }
        return max;
    }

    //sum of factors
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=factors[i];
        }
        return sum;
    }

    //product of factors
    public static long productOfFactors(int[] factors){
        long product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }

    //cube of factors
    public static double productOfCubes(int[] factors){
        double product=1;
        for(int i=0;i<factors.length;i++){
            product*=Math.pow(factors[i],3);
        }
        return product;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        int[] factors=findFactors(number);

        System.out.print("Factors:");
        for(int i=0;i<factors.length;i++)
            System.out.print(factors[i]+" ");
        System.out.println();

        System.out.println("Greatest factor:"+greatestFactor(factors));
        System.out.println("Sum of factors:"+sumOfFactors(factors));
        System.out.println("Product of factors:"+productOfFactors(factors));
        System.out.println("Product of cube of factors:"+productOfCubes(factors));

        input.close();
    }
}
