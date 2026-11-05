class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int i = 0;
        int j = 0;
        int max = 0;
        int maxC = 0;
        int[]arr = new int[26];
        int n = s.length();
        while(j < n){
            l = j - i + 1;
            char ch = s.charAt(j);
            arr[ch - 'A']++;
            maxC = Math.max(maxC , arr[ch - 'A']);
            if(l - maxC <= k){
                max = Math.max(max , l);
            }
            else{
                arr[s.charAt(i) - 'A']--;
                i++;
                for(int x = 0 ; x < arr.length ; x++){
                    maxC = Math.max(maxC , arr[x]);
                }
            }
            j++;
        }
        return max;
    }
}