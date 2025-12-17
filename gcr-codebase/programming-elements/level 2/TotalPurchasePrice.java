import java.util.Scanner;
public class TotalPurchasePrice{
    public static void main(String []args){
	Scanner kb=new Scanner(System.in);
	//taking  unit price of an item and the quantity to be bought
	double unitPrice=kb.nextDouble();
	int quantity=kb.nextInt();

	//calculating total purchase price 
	double totalPurchasePrice=unitPrice*quantity;

	//displaying  total purchase price, quantity and unit price
	System.out.println("The total purchase price is INR "+totalPurchasePrice+"  if the quantity "+quantity+" and unit price is INR  "+unitPrice);
    }
}

	