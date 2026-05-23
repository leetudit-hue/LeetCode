class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int curr = 0;
        int buyp = prices[0];
        int max = 0;
        for(int i = 1 ; i < n ;i++){
            if(prices[i]<buyp){
                buyp = prices[i];
            }
            else if(prices[i]>buyp){
                curr = prices[i]-buyp;
                max = Math.max(curr,max);
            }   
        }     
        return max;
    }
}