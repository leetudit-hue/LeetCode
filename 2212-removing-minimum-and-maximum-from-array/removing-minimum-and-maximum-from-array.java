class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int maxIdx = -1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
        }
        int left = Math.min(maxIdx,minIdx);
        int right = Math.max(maxIdx,minIdx);
        int ans = Integer.MAX_VALUE;
        ans = Math.min(left+1 + (n - right) , ans);
        ans = Math.min(ans , right + 1);
        ans = Math.min(ans , n - left);
        return ans;
    }
}