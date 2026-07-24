class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            if(map.containsKey(u)) return u;
            if(map.containsKey(v)) return v;
            else{
                map.put(u , 1);
                map.put(v , 1);
            }
        }
        return -1;
    }
}