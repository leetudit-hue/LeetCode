class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            long val = (long)mid*mid;
            if(val == x){
                return mid;
            }
            else if(val > x){
                end = mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}