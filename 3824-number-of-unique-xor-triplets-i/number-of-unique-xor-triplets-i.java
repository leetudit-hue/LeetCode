class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        else if(n == 2) return 2;
        int ans = 1;
        while(ans <= n){
            ans *= 2;
        }
        return ans;
    }
}