class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int ans = -1;
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for(int j = 0 ; j <= i ; j++){
                largest = Math.max(nums[j],largest);
            }
            for(int kt = i ; kt < n ; kt++){
                smallest = Math.min(nums[kt],smallest);
            }
            ans = largest - smallest;
            if(ans <= k){
                return i;
            }
        }
        return -1;
    }
}