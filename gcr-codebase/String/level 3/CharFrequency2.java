import java.util.Scanner;

public class CharFrequency2{

    // unique characters 
    public static char[] uniqueCharacters(String text){

        int len=text.length();
        char[] temp=new char[len];
        int count=0;

        for(int i=0;i<len;i++){
            char current=text.charAt(i);
            boolean isUnique=true;

            for(int j=0;j<i;j++){
                if(current==text.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                temp[count++]=current;
            }
        }
        char[] unique=new char[count];
        for(int i=0;i<count;i++){
            unique[i]=temp[i];
        }
        return unique;
    }

    // frequency using ASCII values 
    public static String[][] findFrequency(String text){

        int[] freq=new int[256];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch]++;
        }
        char[] arr=uniqueCharacters(text);
        String[][] result=new String[arr.length][2];

        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            result[i][0]=String.valueOf(ch);
            result[i][1]=String.valueOf(freq[ch]);
        }

        return result;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        String[][] brr=findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i][0]+"\t\t"+brr[i][1]);
        }

        input.close();
    }
}
