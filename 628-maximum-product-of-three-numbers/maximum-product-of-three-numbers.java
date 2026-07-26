class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int ans1 = 1;
        int ans2 = 1;
        Arrays.sort(nums);
        ans1 = (nums[n-1] * nums[n-2] * nums[n-3]);
        ans2 = (nums[0] * nums[1] * nums[n-1]);
        return Math.max(ans1 , ans2);
    }
}