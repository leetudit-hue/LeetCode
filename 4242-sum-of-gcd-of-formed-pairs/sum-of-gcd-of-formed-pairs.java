class Solution {
    public static int gcd(int a , int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int mxi = Integer.MIN_VALUE;
        int[]prefixGcd = new int[n];
        for(int i = 0 ; i < n ; i++){
            mxi = Math.max(mxi,nums[i]);
            prefixGcd[i] = gcd(nums[i],mxi);
        }
        Arrays.sort(prefixGcd);
        int i = 0;
        int j = n-1;
        long ans = 0;
        while(i < j){
            ans += (long) gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return ans;
    }
}