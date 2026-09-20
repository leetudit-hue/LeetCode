class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            res += (('a' - ch + 26)*(i + 1));
        }
        return res;
    }
}