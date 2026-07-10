class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int ld = x % 10;
            ans *= 10;
            ans += ld;
            x /= 10;
        }
        if(ans == Integer.MAX_VALUE || ans == Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}