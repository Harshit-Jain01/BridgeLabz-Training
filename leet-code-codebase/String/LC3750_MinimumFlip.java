import java.util.Scanner;

class LC3750_MinimumFlip{

    public static int minimumFlips(int n){
        StringBuilder b=new StringBuilder();
        while(n!=0){
            int r=n%2;
            b.append(r);
            n/=2;
        }
        StringBuilder s=new StringBuilder(b);
        b.reverse();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(b.charAt(i)!=s.charAt(i))c++;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=kb.nextInt();
        int result=minimumFlips(n);
        System.out.println("Minimum flips required:"+result);
        kb.close();
    }
}
