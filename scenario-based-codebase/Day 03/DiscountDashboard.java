import java.util.Scanner;
public class DiscountDashboard{
   
    public static void main(String[] args){
	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=sc.nextInt();
        double totalBill=0.0;
		
		//taking amount from user
        for(int i=1;i<=n;i++){
            System.out.print("Enter price of item "+i+": ");
            double price=sc.nextDouble();
            totalBill+=price;
        }
		
        double discount=0.0;
        if(totalBill>=7000){
            discount=totalBill*0.1;
        }else if(totalBill>=5000){
            discount=totalBill*0.07;
        }else if(totalBill>=3000){
            discount=totalBill*0.05;
        }else{
            discount=0;
        }
		
		//displaying bill
        double finalAmount=totalBill-discount;
        System.out.println("\n-----Total Bill -----");
        System.out.println("Total Bill     : ₹"+totalBill);
        System.out.println("Discount       : ₹"+discount);
        System.out.println("Final Amount   : ₹"+finalAmount);
		
        sc.close();
    }
}
