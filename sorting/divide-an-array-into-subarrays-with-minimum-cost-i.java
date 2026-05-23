class Solution {
    public int minimumCost(int[] nums) {
       int s = nums[0];
       int min = Integer.MAX_VALUE;
       int smin = Integer.MAX_VALUE;
       for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]<min){
                smin = min;
                min = nums[i];
            }
            else if(nums[i]<smin){
                smin = nums[i];
            }
       } 
       return s + min + smin;
    }
}