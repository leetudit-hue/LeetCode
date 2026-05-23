class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i]<min){
                sec = min;
                min = prices[i];
            }
            else if(prices[i]<sec){
                sec = prices[i];
            }
        }
        if(min + sec <= money){
            return money-(min+sec);
        }
        else{
            return money;
        }
    }
}