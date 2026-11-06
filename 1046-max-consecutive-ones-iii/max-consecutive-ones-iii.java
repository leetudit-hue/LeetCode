class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int max = 0;
        int zeroes = 0;
        while(r < n){
            if(nums[r] == 0) zeroes++;
            if(zeroes <= k){
                max = Math.max(max , r - l + 1);
            }
            while(zeroes > k && l <= r){
                if(nums[l] == 0){
                    zeroes--;
                }
                l++;
            }
            r++;
        }
        return max;
    }
}