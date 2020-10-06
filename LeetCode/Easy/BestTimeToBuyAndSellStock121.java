/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 */
public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock121 main = new BestTimeToBuyAndSellStock121();
        System.out.println(main.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int smallest = Integer.MAX_VALUE;
        for (int num : prices) {
            if (num < smallest) {
                smallest = num;
            } if (num - smallest > profit) {
                profit = num - smallest;
            }
        }
        return profit;
    }
}
