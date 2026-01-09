import java.util.Scanner;

class LC434_NumberOfSegments{
    public static int countSegments(String s){
        if(s.trim().length()==0)return 0;
        return s.trim().split("\\s+").length;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s=sc.nextLine();

        int result=countSegments(s);
        System.out.println("Number of segments:"+result);

        sc.close();
    }
}
