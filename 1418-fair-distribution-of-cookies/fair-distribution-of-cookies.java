class Solution {
    void solve(int idx , int[]arr , int[]c , int k){
        if(idx >= c.length){
            int max = Integer.MIN_VALUE;
            for(int num : arr){
                max = Math.max(max,num);
            }
            res = Math.min(res,max);
            return;
        }
        for(int i = 0 ; i < k ; i++){
            arr[i] += c[idx];
            solve(idx+1,arr,c,k);
            arr[i] -= c[idx];
        }
    }
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] c, int k) {
        res = Integer.MAX_VALUE;
        int[]arr = new int[k];
        solve(0,arr,c,k);
        return res;
    }
}