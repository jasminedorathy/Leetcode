class Solution {
    public int maxProfit(int[] prices) {
    int maxprofit = 0;
    int minPrice = Integer.MAX_VALUE;
    for(int i=0;i<prices.length;i++)
    {
       if(prices[i]<minPrice){
        minPrice = prices[i];
       } 
       else{
        int profit = prices[i] - minPrice;
        if(profit>maxprofit)
        {
            maxprofit = profit;
        }
       }
    } 
    return maxprofit;
        
    }
}