class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int res = 0;
        int count = 0;
        int i = 0;
        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                i++;
                count++;
            }
            else{
                count--;
                if(count < 0){
                    res++;
                    count++;
                }
                if(i+1 < n && s.charAt(i+1) == ')'){
                    i += 2;
                }
                else{
                    res++;
                    i++;
                }
            }
        }
        if(count > 0){
            res += count * 2;
        }
        return res;
    }
}