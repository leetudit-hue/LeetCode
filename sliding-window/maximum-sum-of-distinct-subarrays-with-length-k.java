class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        long sum = 0;
        long ans = 0;
        HashSet<Integer>set = new HashSet<>();
        while(j < n){
            while(set.contains(nums[j])){
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            sum += nums[j];
            set.add(nums[j]);
            if((j - i + 1) == k){
                ans = Math.max(ans,sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return ans;
    }
}