public class Solution {
     public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - buyPrice, profit);
            buyPrice = Math.min(prices[i], buyPrice);
        }
        return profit;
    }
}