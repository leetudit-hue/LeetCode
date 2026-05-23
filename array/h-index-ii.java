class Solution {
    public int hIndex(int[] c) {
        int n = c.length;
        int l = 0;
        int r = n-1;
        int mid = 0;
        while(l <= r){
            mid = l+(r-l)/2;
            if(c[mid] == n-mid){
                return n - mid;
            }
            else if(c[mid] < n-mid){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return n-l;
    }
}