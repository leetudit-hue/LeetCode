class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = Integer.MIN_VALUE;
        int n = s.length();
        if(n == 0 || n == 1) return n;
        for(int i = 0 ; i < n ; i++){
            int[]arr = new int[256];
            for(int j = i ; j < n ; j++){
                if(arr[s.charAt(j)] == 1){
                    break;
                }
                else{
                    arr[s.charAt(j)] = 1;
                }
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}