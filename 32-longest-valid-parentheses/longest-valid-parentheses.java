class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else if(ch == ')') close++;
            if(close == open) res = Math.max(res,open+close);
            else if(close > open){
                open = 0;
                close = 0;
            }
        }
        open = 0;
        close = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else if(ch == ')') close++;
            if(close == open) res = Math.max(res,open+close);
            else if(close < open){
                open = 0;
                close = 0;
            }
        }
        return res;
    }
}