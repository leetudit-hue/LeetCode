class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int ans = 0;
        Set<Character>st = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            if(st.contains(s.charAt(i))){
                ans+=2;
                st.remove(s.charAt(i));
            }
            else{
                st.add(s.charAt(i));
            }
        }
        if(st.size() == 0) return ans;
        return ans+1;
    }
}