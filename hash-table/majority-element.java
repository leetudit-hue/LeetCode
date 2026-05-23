class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int fre = 0;
        for(int i = 0 ; i < n ; i++){
            if(fre == 0){
                ans = nums[i];
            }
            if(nums[i] == ans){
                fre++;
            }
            else{
                fre--;
            }
        }
        return ans;
    }
}