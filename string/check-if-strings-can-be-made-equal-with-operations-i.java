class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        for(int i = 0 ; i < 2 ; i++){
            if(sb.charAt(i) != s2.charAt(i)){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(i+2));
                sb.setCharAt(i+2,temp);
            }
        }
        if(sb.toString().equals(s2)){
            return true;
        }
        return false;
    }
}