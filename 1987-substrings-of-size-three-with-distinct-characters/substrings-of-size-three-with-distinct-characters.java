class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0 ; i < n-2 ; i++){
            StringBuilder sb = new StringBuilder();
            HashSet<Character>st = new HashSet<>();
            for(int j = i ; j <= i+2 ; j++){
                char ch = s.charAt(j);
                sb.append(ch);
            }
            boolean good = true;
            for(int k = 0 ; k < 3 ; k++){
                if(st.contains(sb.charAt(k))){
                    good = false;
                    break;
                }
                st.add(sb.charAt(k));
            }
            if(good) count++;
        }
        return count;
    }
}