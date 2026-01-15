// public class BuySellStocks {
//     public static int maxPrice(int[] prices){
//         int profit = 0;
//         for (int i = 0; i < prices.length-1; i++) {
//             if (prices[i+1] > prices[i]) {
//                 profit += prices[i+1] - prices[i];
//             }
//         }
//         return profit;
//     }
//     public static void main(String[] args) {
//         int[] arr={100, 180, 260, 310, 40, 535, 695};
//         System.out.println(maxPrice(arr));
//     }
// }

// ---------Max Profit at once---
class BuySellStocks{
public static int profitOnce(int prices[]){
    int minPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int price:prices){
        if(minPrice>price){
            minPrice=price;
        }
        else if(price-minPrice>maxProfit){
            maxProfit=price-minPrice;
        }
    }
    return maxProfit;
}
public static void main(String[] args) {
    int arr[]={7, 10, 1, 3, 6, 9, 2};
    System.out.println(profitOnce(arr));
}
}