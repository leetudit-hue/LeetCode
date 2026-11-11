class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        int r = 0;
        int l = 0;
        int st = -1;
        int count = 0;
        int[]hash = new int[256];
        for(int i = 0 ; i < m ; i++){
            hash[t.charAt(i)]++;
        }
        int minL = Integer.MAX_VALUE;
        while(r < n){
            if(hash[s.charAt(r)] > 0){
                count++;
            }
            hash[s.charAt(r)]--;
            while(count == m){
                if(r - l + 1 < minL){
                    minL = r - l + 1;
                    st = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        if(st == -1) return "";
        return s.substring(st , st + minL);
    }
}