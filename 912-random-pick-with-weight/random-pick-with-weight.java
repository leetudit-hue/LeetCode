class Solution {
    int[]prefix;
    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];
        for(int i = 1 ; i < w.length ; i++){
            prefix[i] = prefix[i-1] + w[i];
        }
    }
    
    public int pickIndex() {
        double ran = Math.random();
        double target = ran * prefix[prefix.length - 1];
        for(int i = 0 ; i < prefix.length ; i++){
            if(prefix[i] >= target){
                return i;
            }
        }
        return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */