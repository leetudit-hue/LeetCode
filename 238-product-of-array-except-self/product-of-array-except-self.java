class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pro = 1;
        int w0 = 1;
        int[]ans = new int[n];
        int zeroC = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                w0 *= nums[i];
            }
            else{
                zeroC++;
            }
            pro *= nums[i];
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 0){
                ans[i] = pro / nums[i];
            }
            else{
                if(zeroC > 1){
                    ans[i] = 0;
                }
                else{
                    ans[i] = w0;
                }
            }
        }
        return ans;
    }
}