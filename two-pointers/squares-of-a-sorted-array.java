class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];
        int h = 0;
        int t = n-1;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i]*nums[i];
        }
        for(int i = n-1 ; i >= 0 ; i--){
            if(nums[t]>nums[h]){
                ans[i] = nums[t];
                t--;
            }
            else{
                ans[i] = nums[h];
                h++; 
            }
        }
    return ans;
    }
}