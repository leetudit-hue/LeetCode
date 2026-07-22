class Solution {
    public int findChampion(int n, int[][] edges) {
        int [] invalue = new int[n];
        for(int[]edge : edges){
            int v = edge[1];
            invalue[v]++;
        }
        int count = 0;
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            if(invalue[i] == 0){
                count++;
                ans = i;
            }
            if(count > 1) return -1;
        }
        return ans;
    }
}