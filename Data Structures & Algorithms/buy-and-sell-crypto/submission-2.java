class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int sellPrice = prices[i];
            if (prices[i-1] < buyPrice) {
                buyPrice = prices[i-1];
                System.out.println("buyPrice is " + buyPrice);
            }
            if (sellPrice - buyPrice  > profit){

                profit = sellPrice-buyPrice;
            }
        }
        return profit;
    }
}
