import java.util.Scanner;

public class ShortestLongestWord{

    //length of a string 
    public static int findLength(String text){
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

    // split text into words using charAt()
    public static String[] splitText(String text){
        int len=findLength(text);
        int wordCount=0;

        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                wordCount++;
        }
        wordCount++;

        String[] words=new String[wordCount];
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

    // create 2D array of word 
    public static String[][] createWordLength(String[] words){
        String[][] data=new String[words.length][2];

        for(int i=0;i<words.length;i++){
            int length=findLength(words[i]);
            data[i][0]=words[i];
            data[i][1]=String.valueOf(length);
        }
        return data;
    }

    // shortest and longest string 
    public static int[] findShortestAndLongest(String[][] data){
        int shortest=0,longest=0;

        for(int i=1;i<data.length;i++){
            int curr=Integer.parseInt(data[i][1]);
            int min=Integer.parseInt(data[shortest][1]);
            int max=Integer.parseInt(data[longest][1]);

            if(curr<min)
                shortest=i;
            if(curr>max)
                longest=i;
        }

        return new int[]{shortest,longest};
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the text:");
        String text=input.nextLine();

        String[] words=splitText(text);
        String[][] data=createWordLength(words);
        int[] result=findShortestAndLongest(data);

        System.out.println("\nWords and Lengths:");
        System.out.println("Word\tLength");
        System.out.println("----------------");

        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+Integer.parseInt(data[i][1]));
        }

        System.out.println("\nShortest Word: "+data[result[0]][0]);
        System.out.println("Longest Word: "+data[result[1]][0]);

        input.close();
    }
}
