class Solution {
    public static long find(long n1 , long n2){
        while(n1 % n2 != 0){
            long rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
    public static long calc(long n1 , long n2){
        long product = n1 * n2;
        long gcd = find(n1 , n2);
        return (product / (gcd * gcd));
    }
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ans = Math.max(calc(nums[i] , nums[j]) , ans);
            }
        }
        return ans;
    }
}