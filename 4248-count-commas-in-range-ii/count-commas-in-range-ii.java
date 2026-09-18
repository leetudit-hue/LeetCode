class Solution {
    public long countCommas(long n) {
        if(n < 1000) return 0;
        long res = 0;
        long lower = 1000;
        long comma = 1;
        while(lower <= n){
            long upper = lower * 1000 - 1;
            if(upper > n) upper = n;
            long count = upper - lower + 1;
            res += (comma * count);
            lower *= 1000;
            comma++;
        }
        return res;
    }
}