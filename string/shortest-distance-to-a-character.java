class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int st = 0;
        int prev = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
                while(st <= i){
                    ans[st] = Math.min(Math.abs(st - i), Math.abs(st - prev));
                    st++;
                }
                prev = i;
            }
        }

        // 🔥 IMPORTANT: handle remaining indices
        while(st < n){
            ans[st] = Math.abs(st - prev);
            st++;
        }

        return ans;
    }
}