class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int e = 0;
        int o = 1;
        while(e < n && o < n){
            if(nums[e] % 2 == 0){
                e+=2;
            }
            else if(nums[o]%2 != 0){
                o+=2;
            }
            else{
                int t = nums[e];
                nums[e] = nums[o];
                nums[o] = t;
                o+=2;
                e+=2;
            }
        }
        return nums;
    }
}