class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int f = 0;
        for(int i = 0 ; i < n ; i++){
            sum+=nums[i];
            f += i*nums[i];
        }
        int ans = f;
        for(int i = 0 ; i < n ; i++){
            int newf = f + sum - n*nums[n-1-i];
            ans = Math.max(newf,ans);
            f = newf;
        }
        return ans;
    }
}