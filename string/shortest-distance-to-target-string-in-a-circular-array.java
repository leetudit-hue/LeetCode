class Solution {
    public int closestTarget(String[] words, String target, int st) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(words[i].equals(target)){
                int d1 = Math.abs(i - st);   // direct distance
                int d2 = n - d1;    
                int x = Math.min(d1,d2);         // circular distance
                ans = Math.min(ans,x);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}