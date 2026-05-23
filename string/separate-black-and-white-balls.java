class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long count = 0;
        int second = 0;
        for(int first = 0 ; first < n ; first++){
            if(s.charAt(first) == '0'){
                count += first - second;
                second++;
            }
        }
        return count;
    }
}