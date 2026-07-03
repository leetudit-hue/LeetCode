class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int n = nums.length;
        while(j < n){
            if(nums[j] == 0){
                i = j + 1;
            }
            ans = Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}