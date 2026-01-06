import java.util.Scanner;

class LC345_ReverseVowel{

    public static boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    public static String reverseVowels(String s){
        char[]arr=s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j){
            char c1=arr[i];
            char c2=arr[j];

            if(isvowel(c1)&&isvowel(c2)){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
            else if(!isvowel(c1)&&isvowel(c2)){
                i++;
            }
            else if(isvowel(c1)&&!isvowel(c2)){
                j--;
            }
            else{
                i++;j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverseVowels(s));
        sc.close();
    }
}
