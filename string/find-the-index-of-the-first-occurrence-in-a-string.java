class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        if(m == 1 && haystack.contains(needle)){
            for(int i = 0 ; i < n ; i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    return i;
                }
            }
        }
        for(int i = 0 ; i <= n-m ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,i+m).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}