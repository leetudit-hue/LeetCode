class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
        int n = q.length;
        for(int i = 0 ; i < n ; i++){
            int l = q[i][0];
            int r = q[i][1];
            int k = q[i][2];
            int v = q[i][3];
            while(l <= r){
            nums[l] = (int)((long)nums[l]*v%1000000007);
            l+=k;
            }
        }
        int res = 0;
        for(int i = 0 ; i < nums.length ; i++){
            res ^= nums[i];
        }
        return res;
    }
}