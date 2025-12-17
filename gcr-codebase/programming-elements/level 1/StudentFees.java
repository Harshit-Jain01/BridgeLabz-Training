class StudentFees{
   public static void main(String []args){
	// Create a variable named fee and discountPercent
        int fee=125000,discountPercent=10;
	// finding the discount
	double discount=(double)(fee*discountPercent)/100;
	// finding the fees to pay
	double feesToPay=fee-discount;
	// displaying the discount amount and final discounted fee
	System.out.println(" The discount amount is INR "+discount+"  and final discounted fee is INR "+feesToPay);
    }
}