class Solution {
    public static boolean isGood(int n){
        boolean ans = false;
        while(n > 0){
            int ld = n%10;
            if(ld == 3 || ld == 4 || ld == 7){
                return false;
            }
            else if(ld == 2 || ld == 5 || ld == 6 || ld == 9){
                ans = true;
            }
            n/=10;
        }
        return ans;
    }
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1; i <= n ; i++){
            if(isGood(i)){
                count++;
            }
        }
        return count;
    }
}