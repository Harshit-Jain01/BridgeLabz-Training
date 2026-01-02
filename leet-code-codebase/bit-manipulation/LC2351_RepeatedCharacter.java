import java.util.Scanner;

class LC2351_RepeatedCharacter{

    public static char repeatedCharacter(String s){

        int n=s.length();
        int[] arr=new int[26];
        char ans='a';

        for(int i=0;i<n;i++){
            arr[s.charAt(i)-97]++;
            if(arr[s.charAt(i)-97]==2){
                ans=s.charAt(i);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter string:");
        String s=kb.nextLine();

        char result=repeatedCharacter(s);
        System.out.println("First repeated character: "+result);

        kb.close();
    }
}
