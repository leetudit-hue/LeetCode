class Solution {
    public static long[] fun(int n){
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        while(n != 0){
            int ld = n % 10;
            if(ld != 0){
                sb.append(String.valueOf(ld));
                sum += ld;
            }
            n /= 10;
        }
        long x = Long.parseLong(sb.reverse().toString());
        return new long[]{x,sum};
    }
    public long sumAndMultiply(int n) {
        long[]num = fun(n);
        if(num[1] == 0 || num[0] == 0) return 0;
        return num[0] * num[1];
    }
}