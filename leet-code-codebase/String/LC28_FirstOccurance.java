import java.util.Scanner;

class LC28_FirstOccurance{

    public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter haystack string:");
        String haystack=kb.nextLine();

        System.out.println("Enter needle string:");
        String needle=kb.nextLine();

        int index=strStr(haystack,needle);
        System.out.println("Index: "+index);

        kb.close();
    }
}
