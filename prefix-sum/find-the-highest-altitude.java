class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int n = gain.length;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            current += gain[i];
            max = Math.max(max,current);
        }
        return max;
    }
}