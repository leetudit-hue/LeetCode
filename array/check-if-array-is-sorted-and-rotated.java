class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        if(nums[0]<nums[n-1]){
            for(int i = 0 ; i < n-1 ; i++){
                if(nums[i]>nums[i+1]) return false;
            }
            return true;
        }
        else{
            int i = 0;
            while(i < n-1){
                if(nums[i]<=nums[i+1]){
                    i++;
                }
                else{
                    break;
                }
            }
            i++;
            while(i < n-1){
                if(nums[i]>nums[i+1]){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}