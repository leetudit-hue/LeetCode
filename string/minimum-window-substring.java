class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(n < t.length()) return "";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i = 0;
        int j = 0;
        int st = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int req = t.length();
        while(j < n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>0){
                req--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            while(req == 0){
                st = i;
                minWindowLength = Math.min(minWindowLength,j-i+1);
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                if(map.get(s.charAt(i))>0){
                    req ++;
                }
                i++;
            }
            j++;
        }
        return minWindowLength == Integer.MAX_VALUE ? "" : s.substring(st,minWindowLength+st);
    }
}