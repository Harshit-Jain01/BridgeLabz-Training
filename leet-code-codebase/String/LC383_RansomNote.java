import java.util.Scanner;

class LC383_RansomNote{

    public static boolean canConstruct(String r,String m){
        int[]arr=new int[26];
        for(int i=0;i<r.length();i++){
            arr[r.charAt(i)-97]++;
        }

        int[]brr=new int[26];
        for(int i=0;i<m.length();i++){
            brr[m.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>brr[i]&&arr[i]>0)
                return false;
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string:");
        String r=sc.nextLine();

        System.out.println("Enter second string:");
        String m=sc.nextLine();

        System.out.println(canConstruct(r,m));
        sc.close();
    }
}
