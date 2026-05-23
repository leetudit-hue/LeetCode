class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[]arr = s.split(" ");
        if(arr.length != n){
            return false;
        }
        HashMap<String,Character>map = new HashMap<>();
        HashSet<Character>st = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            char ch = pattern.charAt(i);
            String word = arr[i];
            if(!map.containsKey(word)&&!st.contains(ch)){
                map.put(word,ch);
                st.add(ch);
            }
            else if(!map.containsKey(word) && st.contains(ch)){
                return false;
            }
            else if(map.get(word) != ch) return false;;
        }
        return true;
    }
}