class Solution {
    public static boolean isEnglish(char ch){
        if(ch >= 97 && ch <= 122){
            return true;
        }
        return false;
    }
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(isEnglish(ch)){
                sb.append(ch);
            }
            else if(ch == '*' && sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(ch == '#'){
                String str = sb.toString();
                sb.append(str);
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}