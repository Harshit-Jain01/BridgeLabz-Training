import java.util.Scanner;

class ConsecutiveCharacter{
	
	// maximum length of non-empty substring
    public static int maxPower(String s){
        int max=1,k=1;
        char t=s.charAt(0);
        for(int i=1;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==t){
                k++;
                max=Math.max(k,max);
            }else{
                t=c1;
                k=1;
            }
        }
        return max;
    }

    public static void main(String[] args){
	
		// take input string
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string");
        String s=input.nextLine();
		
		//display result
        System.out.println(maxPower(s));
        input.close();
    }
}
