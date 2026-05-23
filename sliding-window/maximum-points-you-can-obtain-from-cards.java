class Solution {
    public int maxScore(int[] c, int k) {
        int n = c.length;
        int lsum = 0;
        int rsum = 0;
        int max = 0;
        for(int i = 0 ; i < k ; i++){
            lsum += c[i];
        }
        max = lsum;
        int idx = n-1;
        for(int j = k-1 ; j >= 0 ; j--){
            lsum-=c[j];
            rsum +=c[idx--];
            max = Math.max(max,rsum+lsum);
        }
        return max;
    }
}