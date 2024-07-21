class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;//intially
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min) //eg 7<2^31 assign 7 = min intiallly min is 2^31
            {
                min=prices[i];
            }
            int currentProfit=prices[i]-min;
            if(currentProfit>maxProfit)
            {
                maxProfit=currentProfit;
            }
        }
        return maxProfit;
    }
}