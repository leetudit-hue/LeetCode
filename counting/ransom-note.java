class Solution {
    public boolean canConstruct(String r , String magazine) {
        int n = magazine.length();
        HashMap<Character,Integer>mp = new HashMap<>(); 
        for(int i = 0 ; i < n ; i++){
            char ch = magazine.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }
        for(int j = 0 ; j < r.length() ; j++){
            char c = r.charAt(j);
            if(!mp.containsKey(c) || mp.get(c) == 0) return false;
            else{
                mp.put(c,mp.get(c)-1);
            }
        }
        return true;
    }
}