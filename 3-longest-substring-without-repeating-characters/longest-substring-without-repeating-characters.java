class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int[]hash = new int[256];
        int maxi = Integer.MIN_VALUE;
        Arrays.fill(hash,-1);
        int i = 0;
        int j = 0;
        while(j < n){
            if(hash[s.charAt(j)] != -1 && hash[s.charAt(j)] >= i){
                i = (hash[s.charAt(j)] + 1);
            }
            int len = j - i + 1;
            maxi = Math.max(maxi , len);
            hash[s.charAt(j)] = j;
            j++;
        }
        return maxi;
    }
}