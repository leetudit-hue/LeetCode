class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls = 0;
        int rs = 0;
        int val = 0;
        for(int i = 0 ; i < nums.length ; i++){
            rs += nums[i];
        }
        for(int j = 0 ; j < nums.length ; j++){
            val = nums[j];
            rs -=val;
            nums[j] = Math.abs(ls-rs);
            ls+=val;
        }
        return nums;
    }
}