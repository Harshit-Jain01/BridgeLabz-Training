import java.util.Scanner;
public class CharFrequency{

    //character frequency 
    public static String[][] charFrequency(String text){

        int[] freq=new int[256];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(freq[ch]>0){
                uniqueCount++;
                freq[ch]=-freq[ch]; // mark as counted
            }
        }

        for(int i=0;i<256;i++){
            if(freq[i]<0)
                freq[i]=-freq[i];
        }

        String[][] result=new String[uniqueCount][2];
        int index=0;

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(freq[ch]>0){
                result[index][0]=String.valueOf(ch);
                result[index][1]=String.valueOf(freq[ch]);
                freq[ch]=0; 
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        String[][] arr=charFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
        }

        input.close();
    }
}
