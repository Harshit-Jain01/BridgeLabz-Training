import java.util.Scanner;

public class StringLength{

    //length without using length()
    public static int findLength(String text){
        int count=0;

        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
        }
        return count;
    }

    public static void main(String[] args){

        //taking user input
        Scanner input=new Scanner(System.in);
        System.out.println("enter string");
        String text=input.next();

		//calling method
        int l1=findLength(text);
        int l2=text.length();

        System.out.println("Length using custom method:"+l1);
        System.out.println("Length using built-in method:"+l2);

        input.close();
    }
}
