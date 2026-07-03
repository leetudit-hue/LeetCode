class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int i = 0;
        int ans = Integer.MAX_VALUE;
        while(i <= n-k){
            int count = 0;
            for(int j = i ; j - i + 1 <= k; j++){
                if(blocks.charAt(j) == 'W'){
                    count++;
                }
            }
            ans = Math.min(ans,count);
            i++;
        }
        return ans;
    }
}