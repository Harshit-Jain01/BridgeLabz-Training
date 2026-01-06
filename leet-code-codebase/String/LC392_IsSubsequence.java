import java.util.Scanner;

class LC392_IsSubsequence{

    public static boolean isSubsequence(String s,String t){
        char[]arr=s.toCharArray();
        if(s.length()==0)return true;

        int f=0;
        for(int i=0;i<t.length();i++){
            if(arr[f]==t.charAt(i))
                f++;
            if(f>arr.length-1)
                break;
        }

        if(f-1==s.length()-1)
            return true;
        return false;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string:");
        String s=sc.nextLine();

        System.out.println("Enter second string:");
        String t=sc.nextLine();

        System.out.println(isSubsequence(s,t));
        sc.close();
    }
}
