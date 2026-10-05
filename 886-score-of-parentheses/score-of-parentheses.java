class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int score = 0;
        Stack<Integer>st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '('){
                st.push(score);
                score = 0;
            }
            else{
                if(s.charAt(i - 1) == '('){
                    score = 1 + st.peek();
                }
                else{
                    score = (score * 2) + st.peek();
                }
                st.pop();
            }
        }
        return score;
    }
}