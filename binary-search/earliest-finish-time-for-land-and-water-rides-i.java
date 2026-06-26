class Solution {
    public int earliestFinishTime(int[] lt, int[] ld, int[] wt, int[] wd) {
        int n = lt.length;
        int m = wt.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int lst = lt[i]+ld[i];
            for(int j = 0 ; j < m ; j++){
                int finish1 = Math.max(lst,wt[j])+wd[j];
                int wst = wt[j]+wd[j];
                int finish2 = Math.max(wst,lt[i])+ld[i];
                ans = Math.min(ans,Math.min(finish1,finish2));
            }
        }
        return ans;
    }
}