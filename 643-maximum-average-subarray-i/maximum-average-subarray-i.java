class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = -Double.MAX_VALUE;
        int i = 0;
        int n = nums.length;
        if(n == 1){
            return (double) nums[0];
        }
        if(k > n) return 0.0;
        double sum = 0;
        while(i < k){
            sum += nums[i];
            i++;
        }
        ans = Math.max(ans,sum / k);
        while(i < n){
            sum += nums[i];
            sum -= nums[i - k];
            ans = Math.max(ans,sum / k);
            i++;
        }
        return ans;
    }
}