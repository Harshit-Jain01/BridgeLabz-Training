import java.util.Scanner;

public class SplitText{

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

    //split text into words
    public static String[] splitText(String text){
        int len=findLength(text);

        //count words
        int wordCount=1;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                wordCount++;
        }

        //store space indexes
        int[] index=new int[wordCount-1];
        int idx=0;
        for(int i=0;i<len;i++){
            if(text.charAt(i)==' ')
                index[idx++]=i;
        }

        //extract words
        String[] words=new String[wordCount];
        int start=0;
        for(int i=0;i<index.length;i++){
            words[i]=text.substring(start,index[i]);
            start=index[i]+1;
        }
        words[wordCount-1]=text.substring(start,len);

        return words;
    }

    //method to compare two string arrays
    public static boolean compareArrays(String[] a,String[] b){
        if(a.length!=b.length)
            return false;

        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        String s=input.nextLine();

        //user defined split
        String[] s1=splitText(s);

        //built-in split
        String[] s2=s.split(" ");

        //compare results
        boolean result=compareArrays(s1,s2);

        System.out.println("Custom split");
        for(String word:s1)
            System.out.println(word);

        System.out.println("Built-in split");
        for(String word:s2)
            System.out.println(word);

        System.out.println("Both results are equal:"+result);

        input.close();
    }
}
