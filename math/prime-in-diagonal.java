class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int d1 = nums[i][i];
            int d2 = nums[i][n-i-1];
            if(isPrime(d1)){
                ans = Math.max(d1,ans);
            }
            if(isPrime(d2)){
                ans = Math.max(d2,ans);
            }
        }
        return ans;
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2 ; i*i <= n ; i++){
            if(n % i  == 0) return false;
        }
        return true;
    }
}