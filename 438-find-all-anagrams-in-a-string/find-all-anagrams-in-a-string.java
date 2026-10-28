class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        List<Integer>ans = new ArrayList<>();
        int[]pCount = new int[26];
        int[]sCount = new int[26];
        for(int i = 0 ; i < p.length() ; i++){
            char ch = p.charAt(i);
            pCount[ch - 'a']++;
        }
        for(int i = 0 ; i < p.length() ; i++){
            char ch = s.charAt(i);
            sCount[ch - 'a']++;
        }
        if(Arrays.equals(sCount,pCount)){
            ans.add(0);
        }
        int i = p.length();
        while(i < s.length()){
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - p.length()) - 'a']--;
            if(Arrays.equals(sCount,pCount)){
                ans.add(i - p.length() + 1);
            }
            i++;
        }
        return ans;
    }
}