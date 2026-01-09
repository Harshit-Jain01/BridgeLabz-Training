import java.util.Scanner;

class LC409_LongestPalindrome{
    public static int longestPalindrome(String s){
        int[] arr=new int[123];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int all=0,f=0;
        for(int x:arr){
            if(x%2==0)
                all+=x;
            else{
                all+=(x-1);
                f=1;
            }
        }
        return f==1?(all+1):(all);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();

        int result=longestPalindrome(s);
        System.out.println("Longest Palindrome Length:"+result);
        sc.close();
    }
}
