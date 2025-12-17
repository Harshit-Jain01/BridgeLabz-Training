class ProfitLossPercentage {
    public static void main(String []args){
       //declaring the cost price and selling price
	int costPrice=129,sellingPrice=191;
       //finding the profit
	int profit=sellingPrice-costPrice;
       //Calculating the profit percent
        double percent=((double)profit/costPrice)*100;
       // displaying the costPrice and selling price and the profit and profit percent
	System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+percent);
           }
}