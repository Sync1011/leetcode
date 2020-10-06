/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. 
 * You may complete as many transactions as you like 
 * (i.e., buy one and sell one share of the stock multiple times).
 */
public class BestTimeToBuyAndSellStockII122 {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII122 main = new BestTimeToBuyAndSellStockII122();
        System.out.println(main.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
