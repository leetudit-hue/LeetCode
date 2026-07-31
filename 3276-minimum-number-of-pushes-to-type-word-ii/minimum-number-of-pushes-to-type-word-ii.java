class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[]freq = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int idx = 0;
        for(int i = 25 ; i >= 0 ; i--){
            if(freq[i] != 0){
                ans += (((idx / 8) + 1) * freq[i]);
                idx++;
            }
        }
        return ans;
    }
}