
public class ProfitandLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sellingPrice= 191;
		int costPrice = 129;
		System.out.println(" The cose price in INR is " +costPrice + " and the selling price is" + sellingPrice );


		        if (sellingPrice > costPrice) {
		            int profit = sellingPrice - costPrice;
		            double profitPercent = ((double) profit / costPrice) * 100;
		            System.out.println("The profit is INR " + profit + " and the profit percentage is " + profitPercent + "%");
		        } else   {
		            int loss = costPrice - sellingPrice;
		            double lossPercent = ((double) loss / costPrice) * 100;
		            System.out.println("The loss is INR " + loss + " and the loss percentage is " + lossPercent + "%");
		        } 
	}

}
