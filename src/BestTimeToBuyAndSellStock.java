public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPriceSoFar = prices[0];

		for (int price : prices) {
			// we want to find the min price so far
			if (price < minPriceSoFar)
				minPriceSoFar = price;

				// update the maxProfit if we found a bigger profit
			else if (price - minPriceSoFar > maxProfit) {
				maxProfit = price - minPriceSoFar;
			}
		}

		return maxProfit;

	}

	// time: O(n), n is length of prices
	// space: O(1)
}
