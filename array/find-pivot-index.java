class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        int lsum = 0;
        for(int i = 0 ; i < n ; i++){
            rsum+=nums[i];
        }
        int ans = -1;
        for(int j = 0 ; j < n ; j++){
            int v = nums[j];
            rsum -= nums[j];
            if(lsum == rsum){
                ans = j;
                break;
            }
            lsum+=v;
        }
        return ans;
    }
}