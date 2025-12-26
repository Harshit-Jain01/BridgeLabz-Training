import java.util.Stack;
import java.util.Scanner;

class ValidParenthesis{
	
	// method to check if parentheses are valid
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        char[] arr=s.toCharArray();

        for(char c:arr){
            if(c=='(')
                st.push(')');
            else if(c=='[')
                st.push(']');
            else if(c=='{')
                st.push('}');
            else if(st.isEmpty() || st.pop()!=c)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
	
		//take input parentheses string
        Scanner input=new Scanner(System.in);
        System.out.println("Enter parentheses string");
        String s=input.nextLine();
		
		//display result
        System.out.println(isValid(s));
        input.close();
    }
}
