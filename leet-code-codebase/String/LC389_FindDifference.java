import java.util.Scanner;

class LC389_FindDifference{

    public static char findTheDifference(String s,String t){
        if(s.length()==0)return t.charAt(0);

        int[]arr=new int[26];
        int[]brr=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }

        for(int i=0;i<t.length();i++){
            brr[t.charAt(i)-97]++;
        }

        char c='a';
        for(int i=0;i<26;i++){
            if(arr[i]!=brr[i]){
                c=(char)(97+i);
            }
        }
        return c;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first string:");
        String s=sc.nextLine();

        System.out.println("Enter second string:");
        String t=sc.nextLine();

        System.out.println(findTheDifference(s,t));
        sc.close();
    }
}
