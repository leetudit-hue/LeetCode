class Solution {
    public int missingNumber(int[] nums) {
        int allxor = 0;
        int n = nums.length;
        for(int i = 0 ; i <= n ; i++){
            allxor = i^allxor;
        }

        for(int i = 0 ; i < n ; i++){
            allxor = allxor^nums[i];
        }
        return allxor;
    }
}