class Solution {
    public int minOperations(int[] nums, int x) {
        long n = nums.length;
        int ans = Integer.MIN_VALUE;
        long sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum < x) return -1;
        sum -= x;
        if(sum == 0) return nums.length;
        int i = 0;
        int j = 0;
        long curr = 0;
        while(j < n){
            curr += nums[j];
            if(curr == sum){
                ans = Math.max(ans , j-i+1);
            }
            while(i <= j && curr > sum){
                curr -= nums[i];
                i++;
                if(curr == sum){
                    ans = Math.max(ans , j-i+1);
                }
            }
            j++;
        }
        if(ans == Integer.MIN_VALUE) return -1;
        return (int)n - ans;
    }
}