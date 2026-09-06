class Solution {
    int check(StringBuilder sb){
        int i = 1;
        int count = 0;
        while(i < sb.length()){
            if(sb.charAt(i) == sb.charAt(i-1)){
                count++;
            }
            i++;
        }
        return count;
    }
    public int countRotations(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int count = 0;
        if(check(sb) == k){
            count++;
        };
        for(int i = 0 ; i < n - 1 ; i++){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(check(sb) == k){
                count++;
            };
        }
        return count;
    }
}