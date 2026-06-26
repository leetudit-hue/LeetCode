class Solution {
    public int digitFrequencyScore(int n) {
        if(n/10 == 0) return n;
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>st = new HashSet<>();
        while(n>0){
            int ld = n%10;
            if(map.containsKey(ld)){
                map.put(ld,map.get(ld)+1);
            }
            else{
                map.put(ld,1);
            }
            st.add(ld);
            n/=10;
        }
        int ans = 0;
        for(int i : st){
            int x = map.get(i);
            ans += (i * x);
        }
        return ans;
    }
}