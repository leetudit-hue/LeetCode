class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        int taken[] = new int[26];
        int lastOcc[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            lastOcc[ch - 'a'] = i;
        }
        sb.append(s.charAt(0));
        taken[s.charAt(0) - 'a'] = 1;
        for(int i = 1 ; i < n ; i++){
            char ch = s.charAt(i);
            if(taken[ch - 'a'] != 0){ 
                continue;
            }
            else if(sb.charAt(sb.length() - 1) < ch){
                taken[ch - 'a'] = 1;
                sb.append(ch);
            }
            else{
                char last = sb.charAt(sb.length() - 1);
                while(sb.length() > 0 && last > ch && lastOcc[last - 'a'] > i){
                    sb.deleteCharAt(sb.length() - 1);
                    taken[last - 'a'] = 0;
                    if(sb.length() > 0){
                        last = sb.charAt(sb.length() - 1);
                    }
                }
                sb.append(ch);
                taken[ch - 'a'] = 1;
            }
        }
        return sb.toString();
    }
}