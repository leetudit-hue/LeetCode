class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        boolean flag = false;
        int i = 0;
        while(i < n){
            if(s.charAt(i) != '1'){
                flag = true;
            }
            else if(flag){
                return false;
            }
            i++;
        }
        return true;
    }
}