class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int product = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if((nums[i]-1) * (max-1) > product){
                product = (nums[i]-1) * (max-1);
            } 
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return product;
    }
}