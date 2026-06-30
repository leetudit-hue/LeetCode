class Solution {
    public int countSegments(String s) {
        int n = s.length();
        s = s.strip();
        n = s.length();
        int count = 0;
        if(n<1 || s.isBlank()) return count;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == ' '){
                count++;
                while(i+1 < n && s.charAt(i) == ' '){
                    i++;
                }
            }
        }
        return count+1;
    }
}