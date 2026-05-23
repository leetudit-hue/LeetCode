class Solution {
    public int mirrorDistance(int n) {
        int x = revOf(n);
        return Math.abs(x-n);
    }
    public static int revOf(int n){
        int rev = 0;
        while(n != 0){
            int ld = n%10;
            rev = rev*10+ld;
            n/=10;
        }
        return rev;
    }
}