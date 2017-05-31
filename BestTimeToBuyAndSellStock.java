
public class BestTimeToBuyAndSellStock {

	public static int max(int[] a, int low, int high) {
		int max = 0;
		for (int i = low; i < high; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	// public static int maxProfit(int[] prices) {
	// int l = prices.length;
	// if (l == 0 || l == 1)
	// return 0;
	// int buy = 0, sell = 0;
	// int profit = sell - buy;
	// for (int i = 0; i < l; i++) {
	// buy = prices[i];
	// sell = max(prices, i + 1, l);
	// System.out.println(i + " " + sell);
	// if (sell - buy > profit)
	// profit = sell - buy;
	//
	// }
	// return profit;
	// }

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0, profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				profit = prices[i] - minPrice;
				if (profit > maxProfit)
					maxProfit = profit;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int a[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(a));

	}

}
