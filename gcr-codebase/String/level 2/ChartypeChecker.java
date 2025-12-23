import java.util.Scanner;

public class ChartypeChecker{

    // Method to check character type
    public static String checkCharacter(char ch) {

        if(ch>=65&&ch<=90){
            ch=(char)(ch+32);
        }

        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not a Letter";
    }

    // find vowels and consonants using charAt()
    public static String[][] characterTypes(String text) {

        int len=text.length();
        String[][] result=new String[len][2];

        for(int i=0;i<len;i++){
            char ch=text.charAt(i);
            result[i][0]=String.valueOf(ch);
            result[i][1]=checkCharacter(ch);
        }

        return result;
    }

    // display 2D array 
    public static void displayResult(String[][] data){

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t\t"+data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        String[][] result=characterTypes(text);
        displayResult(result);

        input.close();
    }
}
