class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        long ans = k * (max-min);
        return ans;
    }
}