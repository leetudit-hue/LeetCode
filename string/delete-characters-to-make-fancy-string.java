class Solution {
    public String makeFancyString(String s) {
        int m = s.length();
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < m ; i++){
            int n = res.length();
            if(res.length() >= 2 && res.charAt(n-1) == s.charAt(i) && res.charAt(n-2) == s.charAt(i)){
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}