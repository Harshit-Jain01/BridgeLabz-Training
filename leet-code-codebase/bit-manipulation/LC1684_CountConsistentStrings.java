import java.util.Scanner;

class LC1684_CountConsistentStrings{

    public static int countConsistentStrings(String all,String[] words){

        int sap=0;

        for(int i=0;i<words.length;i++){
            String w=words[i];
            for(int k=0;k<w.length();k++){
                if(!all.contains(String.valueOf(w.charAt(k)))){
                    sap++;
                    break;
                }
            }
        }
        return words.length-sap;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);

        System.out.println("Enter allowed string:");
        String all=kb.nextLine();

        System.out.println("Enter number of words:");
        int n=kb.nextInt();
        kb.nextLine();

        String[] words=new String[n];
        System.out.println("Enter words:");
        for(int i=0;i<n;i++){
            words[i]=kb.nextLine();
        }

        int result=countConsistentStrings(all,words);
        System.out.println("Count of consistent strings: "+result);

        kb.close();
    }
}
