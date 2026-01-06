import java.util.Scanner;

class LC387_FirstUniqueChar{

    public static int firstUniqChar(String s){
        int[]arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        int ans=-1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string:");
        String s=sc.nextLine();

        System.out.println(firstUniqChar(s));
        sc.close();
    }
}
