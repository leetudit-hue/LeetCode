class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashSet<Character> st = new HashSet<>();
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            if(st.contains(s.charAt(i))){
                res+=2;
                st.remove(s.charAt(i));
            }
            else{
                st.add(s.charAt(i));
            }
        }
        if(!st.isEmpty()) return res + 1;
        return res;
    }
}