import java.util.*;

class FindFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
	
	//taking input a number by the user and creating variable maxFactor
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        // displaying factors
        System.out.print("Factors are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}