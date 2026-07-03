class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int i = 0;
        int j = 0;
        int size = k;
        int count = 0;
        int ans = Integer.MAX_VALUE;
        while(j < k){
            if(blocks.charAt(j) == 'W'){
                count++;
            }
            j++;
        }
        ans = Math.min(ans,count);
        while(j < n){
            if(blocks.charAt(j) == 'W'){
                count++;
            }
            if(blocks.charAt(i) == 'W'){
                count--;
            }
            i++;
            j++;
            ans = Math.min(ans,count);
        }
        return ans;
    }
}