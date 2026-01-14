public class BuySellStocks {
    public static int maxPrice(int[] prices){
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxPrice(arr));
    }
}
