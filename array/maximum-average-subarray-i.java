class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        max = sum;
        int l = 0;
        int r = k;
        while(r < n){
            sum-=nums[l++];
            sum += nums[r++];
            max = Math.max(sum,max);
        }
        return (double) max/k;
    }
}