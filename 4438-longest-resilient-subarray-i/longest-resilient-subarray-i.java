class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n = nums.length;
        int max = 1;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            int rem = nums[i] % k;
            boolean same = true;
            for(int j = i ; j < n ; j++){
                sum += nums[j];
                if(rem != nums[j] % k){
                    same = false;
                }
                if(same && sum % k == rem){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}