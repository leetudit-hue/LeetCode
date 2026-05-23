class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[]freq = new int[26];
        Arrays.fill(freq,-1);
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(freq[ch-'a'] == -1){
                freq[ch-'a'] = i;
            }
            else{
                int dist = i-freq[ch-'a']-1;
                if(dist != distance[ch-'a']){
                    return false;
                }
            }
        }
        return true;
    }
}