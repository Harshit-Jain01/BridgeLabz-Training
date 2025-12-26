import java.util.Scanner;

class LongestCommonPrefix{

    // static method
    public static String longestCommonPrefix(String[] strs){

        if(strs.length==1)
            return strs[0];

        StringBuilder sb=new StringBuilder("");
        int max=200;

        for(int i=0;i<strs.length;i++){
            if(max>strs[i].length())
                max=strs[i].length();
        }

        for(int i=0;i<max;i++){
            char c=strs[0].charAt(i);
            int f=0;

            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=c){
                    f=1;
                    break;
                }
            }
            if(f==0)
                sb.append(c);
            else
                break;
        }

        return sb.toString();
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        // taking number of strings
        System.out.println("Enter number of strings");
        int n=input.nextInt();
        input.nextLine();

        String[] strs=new String[n];

       System.out.println("Enter  strings");
        for(int i=0;i<n;i++){
            strs[i]=input.nextLine();
        }

        // calling method
        String result=longestCommonPrefix(strs);

        // displaying result
        System.out.println("Longest Common Prefix: "+result);

        input.close();
    }
}
