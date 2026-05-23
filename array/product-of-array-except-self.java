class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]suff = new int[n];
        int[]pref = new int[n];
        suff[0] = 1;
        pref[n-1] = 1;
        for(int i = 1 ; i < n ; i++){
            suff[i] = nums[i-1]*suff[i-1];
        }
        for(int j = n-2 ; j >= 0 ; j--){
            pref[j] = nums[j+1]*pref[j+1];
        }
        int[]res = new int[n];
        for(int i = 0 ; i < n ; i++){
            res[i] = suff[i]*pref[i];
        }
        return res;
    }
}