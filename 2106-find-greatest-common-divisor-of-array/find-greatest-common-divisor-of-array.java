class Solution {
    public static int gcd(int n1 , int n2){
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        for(int num : nums){
            small = Math.min(small , num);
            big = Math.max(num , big);
        }
        return gcd(small , big);
    }
}