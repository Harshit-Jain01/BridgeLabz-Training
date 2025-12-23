import java.util.Scanner;

public class TrimString{

    // start and end index without spaces
    public static int[] trimIndexes(String text){

        int start=0;
        int end=text.length()-1;
        while(start<=end && text.charAt(start)==' ')
            start++;
        
        while(end>=start && text.charAt(end)==' ')
            end--;
        

        return new int[]{start,end};
    }

    // create substring 
    public static String createSubstring(String text,int start,int end){

        String result="";

        for(int i=start;i<=end;i++){
            result+=text.charAt(i);
        }

        return result;
    }

    // compare two strings 
    public static boolean compareStrings(String s1,String s2){

        if(s1.length()!=s2.length())
            return false;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the text");
        String text=input.nextLine();

        // calling methods
        int[] indexes=trimIndexes(text);
        String trimmedText=createSubstring(text,indexes[0],indexes[1]);

        // built-in trim
        String builtInTrim=text.trim();

        // compare  results
        boolean isSame=compareStrings(trimmedText,builtInTrim);

        System.out.println("\nTrimmed Text "+trimmedText+"'");
        System.out.println("Trimmed Text "+builtInTrim+"'");
        System.out.println("Are both results same? "+isSame);

        input.close();
    }
}
