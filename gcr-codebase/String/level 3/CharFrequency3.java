import java.util.Scanner;

public class CharFrequency3{

    //  frequency using nested loops
    public static String[] findFrequency(String text){

        char[] chars=text.toCharArray();
        int[] freq=new int[chars.length];
        for(int i=0;i<chars.length;i++){
            freq[i]=1;
        }
		
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='0')
                continue;

            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    freq[i]++;
                    chars[j]='0';
                }
            }
        }
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0')
                count++;
        }
        String[] result=new String[count];
        int index=0;

        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                result[index]=chars[i]+" : "+freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        String[] f=findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");

        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }

        input.close();
    }
}
