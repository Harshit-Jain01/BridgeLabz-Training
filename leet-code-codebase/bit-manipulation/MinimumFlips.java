import java.util.Scanner;

class LC3750_MinimumFlips{

    public static int minimumFlips(int n){

        String sb="";

        while(n!=0){
            sb+=n%2;
            n=n/2;
        }

        String rev="";
        for(int i=sb.length()-1;i>=0;i--){
            rev+=sb.charAt(i);
        }

        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=rev.charAt(i))
                count++;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter number:");
        int n=kb.nextInt();

        int result=minimumFlips(n);
        System.out.println("Minimum flips: "+result);

        kb.close();
    }
}
