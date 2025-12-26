import java.util.Scanner;

class TitleCapitalize{

    public static String capitalizeTitle(String title) {
	
        String []arr=title.split(" ");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<3)
                sb.append(arr[i].toLowerCase());
            else {
                char c=arr[i].charAt(0);
                sb.append(String.valueOf(c).toUpperCase());
                sb.append(arr[i].substring(1,arr[i].length()).toLowerCase());
            }
            if(i!=arr.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }

    // main method
    public static void main(String[] args) {
	
		//taking input string
        Scanner input=new Scanner(System.in);
        System.out.println("Enter title:");
        String title=input.nextLine();
		
		//calling method 
        String result=capitalizeTitle(title);
		
		//displaying result
        System.out.println("Capitalized Title:");
        System.out.println(result);

        input.close();
    }
}
