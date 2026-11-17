class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int maxLen = 1;
        int pre = Integer.MIN_VALUE;
        int len = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] - 1 == pre){
                len++;
                pre = nums[i];
            }
            else if(nums[i] != pre){
                pre = nums[i];
                len = 1;
            }
            maxLen = Math.max(maxLen , len);
        }
        return maxLen;
    }
}