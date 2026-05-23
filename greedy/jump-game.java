class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            if(i > max){
                return false;
            }
            if((nums[i]+i) > max){
                max = nums[i]+i;
            }
        }
        return true;
    }
}