class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();
        int ans = 0;
        int count1 = 0;
        int count0 = 0;
        for(int j = 0 ; j < n ; j++){
            if(s.charAt(j) == '1'){
                count1++;
            }
            else{
                count0++;
            }
            if(Math.abs(count0 - count1) <= 1) ans++;
        }
        return ans;
    }
}