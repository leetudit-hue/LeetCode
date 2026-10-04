class Solution {
    boolean check(StringBuilder sb){
        HashSet<Character>st = new HashSet<>();
        for(int i = 0 ; i < 3 ; i++){
            if(st.contains(sb.charAt(i))) return false;
            st.add(sb.charAt(i));
        }
        return true;
    }
    public int countGoodSubstrings(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int j = 0;
        int count = 0;
        while(j < n){
            sb.append(s.charAt(j));
            j++;
            if(sb.length() == 3){
                if(check(sb)) count++;
                sb.deleteCharAt(0);
            }
        }
        return count;
    }
}