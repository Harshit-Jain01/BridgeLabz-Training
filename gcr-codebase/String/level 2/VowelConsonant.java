import java.util.Scanner;

public class VowelConsonant{

    //character is Vowel, Consonant or Not a Letter
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

    //find vowels and consonants using charAt()
    public static int[] vowelsAndConsonants(String text){
        int vowels=0,consonants=0;

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            String result=checkCharacter(ch);

            if(result.equals("Vowel"))
                vowels++;
            else if(result.equals("Consonant"))
                consonants++;
        }
		
        return new int[]{vowels,consonants};
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

		//calling methods
        int[] count=vowelsAndConsonants(text);

        System.out.println("Number of Vowels: "+count[0]);
        System.out.println("Number of Consonants: "+count[1]);

        input.close();
    }
}
