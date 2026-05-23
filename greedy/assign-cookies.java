class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i < m && j < s.length){
            if(g[i] <= s[j]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}