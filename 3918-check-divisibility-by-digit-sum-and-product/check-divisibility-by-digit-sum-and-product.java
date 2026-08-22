class Solution {
    public static boolean check(int n){
        int digitS = 0;
        int digitP = 1;
        int sum = 0;
        int org = n;
        while(n > 0){
            int ld = n % 10;
            digitS += ld;
            digitP *= ld;
            n = n / 10;
        }
        sum = (digitS + digitP);
        return ( org % sum == 0);
    }
    public boolean checkDivisibility(int n) {
        return check(n);
    }
}