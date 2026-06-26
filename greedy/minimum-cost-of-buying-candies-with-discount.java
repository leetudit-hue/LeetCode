class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;

        if(n == 1 || n == 2){
            int sum = 0;
            for(int i : cost){
                sum+=i;
            }
            return sum;
        }
        int ans = 0;
        Arrays.sort(cost);
        for(int i = n-1 ; i >= 0 ; i-=3){
            if(i-1 >= 0){
            ans+=cost[i]+cost[i-1];
            }
            else{
                ans+=cost[i];
            }
        }
        return ans;
    }
}