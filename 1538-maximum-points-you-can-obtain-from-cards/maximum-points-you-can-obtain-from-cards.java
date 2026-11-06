class Solution {
    public int maxScore(int[] cp, int k) {
        int n = cp.length;
        int lsum = 0;
        int rsum = 0;
        for(int i = 0 ; i < k ; i++){
            lsum += cp[i];
        }
        int max = lsum;
        int right = n - 1;
        for(int j = k - 1 ; j >= 0 ; j--){
            lsum -= cp[j];
            rsum += cp[right];
            right--;
            max = Math.max(max , lsum + rsum);
        }
        return max;
    }
}