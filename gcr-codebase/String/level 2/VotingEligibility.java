import java.util.Scanner;

public class VotingEligibility{

    // random 2-digit ages
    public static int[] generateAges(int n){
        int[] ages=new int[n];
        for(int i=0;i<n;i++){
            ages[i]=10+(int)(Math.random()*90);
        }
        return ages;
    }

    // check voting eligibility
    public static String[][] eligibility(int[] ages){

        String[][] r=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            r[i][0]=String.valueOf(ages[i]);
            if(ages[i]<0){
                r[i][1]="false";
            }
            else if(ages[i]>=18){
                r[i][1]="true";
            }
            else{
                r[i][1]="false";
            }
        }
        return r;
    }

    // display the result 
    public static void displayResult(String[][] data){

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+data[i][1]);
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter students ");
        int n=input.nextInt();

        // generate ages
        int[] ages=generateAges(n);

        // check voting eligibility
        String[][] res=eligibility(ages);

        // display result
        displayResult(res);

        input.close();
    }
}
