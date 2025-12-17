import java.util.Scanner;
class FeesOfStudent{
    public static void main(String []args){
	Scanner kb = new Scanner(System.in);
	// declaring a variable named fee and discountPercent and taking imput from user
        int fee,discountPercent;
	fee=kb.nextInt();
	discountPercent=kb.nextInt();

	// finding the discount and  the fees to pay
	double discount=(double)(fee*discountPercent)/100;
	double feesToPay=fee-discount;

	// displaying the discount amount and final discounted fee
	System.out.println(" The discount amount is INR "+discount+"  and final discounted fee is INR "+feesToPay);
    }
}
     