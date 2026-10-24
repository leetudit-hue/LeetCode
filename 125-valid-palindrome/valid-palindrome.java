class Solution {
    boolean isAlpha(char ch){
        if(ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57) return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.strip();
        s = s.toLowerCase();
        if(s.length() == 0 || s.length() == 1) return true;
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(isAlpha(s.charAt(i)) && isAlpha(s.charAt(j))){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            else{
                if(!isAlpha(s.charAt(i))){
                    i++;
                } 
                if(!isAlpha(s.charAt(j))){
                    j--;
                }
            }
        }
        return true;
    }
}