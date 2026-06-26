class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int lsum = 0;
        int rsum = 0;
        int sum = 0;
        int curr = 0;
        for(int x : nums){
            sum += x;
        }
        int[]ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            curr += nums[i];
            rsum = sum - curr;
            ans[i] = Math.abs(rsum-lsum);
            lsum += nums[i];
        }
        return ans;
    }
}