import java.util.Scanner;

class LC58_LastWord{

    public static int lengthOfLastWord(String s){
        int t=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>64 && ch<91)||(ch>96 && ch<123))
                t++;
            if(t>0 && ch==' ')
                break;
        }
        return t;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter string:");
        String s=kb.nextLine();

        int result=lengthOfLastWord(s);
        System.out.println("Length of last word: "+result);

        kb.close();
    }
}
