class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i < m ; i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i = 0 , j = 0;
        int st = -1;
        int minL = Integer.MAX_VALUE;
        int count = m;
        while(j < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) > 0){
                count--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            while(count == 0){
                if(minL > j - i + 1){
                    minL = j - i + 1;
                    st = i;
                }
                char left = s.charAt(i);
                map.put(left,map.get(left)+1);
                if(map.get(left) > 0){
                    count ++;
                }
                i++;
            }
            j++;
        }
        return st == -1 ? "" : s.substring(st,st+minL);
    }
}