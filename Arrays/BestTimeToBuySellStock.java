
public class BestTimeToBuySellStock {
public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profitToday);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}

