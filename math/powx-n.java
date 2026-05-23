class Solution {
    public double myPow(double x, int n){
        double ans = 1;
        long b = n;
        if(n == 0) return 1.0;
        if(x == 0) return 0.0;
        if(n == 1) return x;
        if(x == 1 && n < 0 && n%2 == 0) return 1;
        if(x == 1 && n < 0 && n%2 == 0) return -1;
        if(b < 0){
            b = -1*b;
            x = 1/x;
        }
        while(b>0){
            long ld = b % 2;
            if(ld == 1){
                ans *= x;
            }
            x *= x;
            b/=2;
        }
        return ans;
    }
}