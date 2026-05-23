class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        if(n1<n2) return new ArrayList<>();
        int i = 0;
        int j = 0;
        int[]pcount = new int[26];
        int[]wcount = new int[26];
        ArrayList<Integer>ans = new ArrayList<>();
        for(int x = 0 ; x < n2 ; x++){
            pcount[p.charAt(x) - 'a']++;
        }
        while(j < n2){
            wcount[s.charAt(j) - 'a']++;
            j++;
        }
        if(Arrays.equals(pcount,wcount)){
            ans.add(0);
        }
        for(int l = j ; l < n1 ; l++){
            wcount[s.charAt(i)-'a']--;
            wcount[s.charAt(l)-'a']++;
            if(Arrays.equals(wcount,pcount)){
                ans.add(i+1);
            }
            i++;
        }
        return ans;
    }
}