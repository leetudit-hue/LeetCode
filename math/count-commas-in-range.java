class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int digit = 0;
        int temp = n;
        if(n < 1000){
            ans = 0;
        }
        else{
            while(temp > 0){
                digit++;
                temp/=10;
            }
            if(digit == 4 || digit == 5){
                ans = n - 1000 +1;
            }
            else{
                int x = n - 99999;
                x-=1000;
                return x+2;
            }
        }
        return ans;
    }
}