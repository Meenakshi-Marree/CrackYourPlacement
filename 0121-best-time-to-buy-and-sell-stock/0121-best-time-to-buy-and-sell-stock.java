class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
            int cost = prices[i]-mini;
            maxProfit = Math.max(maxProfit,cost);
            mini= Math.min(mini,prices[i]);
        }
        return maxProfit;
    }
}