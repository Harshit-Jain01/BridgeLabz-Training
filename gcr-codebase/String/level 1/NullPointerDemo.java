public class NullpointerDemo{

    // generate NullPointerException
    public static void generateException() {
        String text = null;   
        System.out.println(text.length()); 

		}

    // handle NullPointerException
    public static void handleException() {
        String text = null; 
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Calling method
        System.out.println("Generating NullPointerException:");
		try{
        generateException();
		}catch(NullPointerException ex){
        handleException();
		}
       
    }
}