class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(t.length() > n) return "";
        int m = t.length();
        int start = -1;
        int minL = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int count = m;
            HashMap<Character,Integer>map = new HashMap<>();
            for(int j = 0 ; j < m ; j++){
                char ch = t.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for(int k = i ; k < n ; k++){
                char ch = s.charAt(k);
                if(map.containsKey(ch) && map.get(ch) > 0){
                    count--;
                }
                if(count == 0){
                    if(k-i+1 < minL){
                        minL = k-i+1;
                        start = i;
                    }
                    break;
                }
                map.put(ch,map.getOrDefault(ch,0)-1);
            }
        }
        return minL == Integer.MAX_VALUE ? "" : s.substring(start,start+minL);
    }
}