import java.util.Scanner;

public class SplitWords{

    //length of a string
    public static int findLength(String text) {
        int count=0;
        while(true){
            try{
                text.charAt(count);
                count++;
            }catch(Exception e){
                break;
            }
        }
        return count;
    }

    //split text into words using charAt()
    public static String[] splitText(String text) {
        int len=findLength(text);
        int c=0;

        // count words
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' '){
                c++;
            }
        }
        c++;
        String[] words=new String[c];
        int start=0,index=0;
        for(int i=0;i<=len;i++){
            if(i==len||text.charAt(i)==' '){
                String word="";
                for(int j=start;j<i;j++){
                    word+=text.charAt(j);
                }
                words[index++]=word;
                start=i+1;
            }
        }
        return words;
    }

    // 2D array of word and its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result=new String[words.length][2];

        for(int i=0;i<words.length;i++){
            int length=findLength(words[i]);
            result[i][0]=words[i];
            result[i][1]=String.valueOf(length);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter string");
        String s=input.nextLine();

        String[] words=splitText(s);
        String[][] data=wordsWithLength(words);

        // Display result
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for(int i=0;i<data.length;i++){
            int l=Integer.parseInt(data[i][1]);
            System.out.println(data[i][0]+"\t"+l);
        }

        input.close();
    }
}
