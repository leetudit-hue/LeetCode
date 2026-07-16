class Solution {
    public static int gcd(int a , int b){
        int n2 = Math.min(a , b);
        int n1 = Math.max(a , b);
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
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