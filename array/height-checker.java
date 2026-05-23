class Solution {
    public int heightChecker(int[] h) {
        int c = 0;
        int n = h.length;
        int[]ans = new int[n];
        for(int i = 0 ; i<n ; i++){
            ans[i] = h[i];
        }
        Arrays.sort(ans);
        for(int i = 0 ; i < n ; i++){
            if(h[i]!=ans[i]){
                c++;
            }
         }
        return c;
    }
}