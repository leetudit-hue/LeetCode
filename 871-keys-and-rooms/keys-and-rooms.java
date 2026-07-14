class Solution {
    public static void bfs(List<List<Integer>> adj , boolean[]vis , int n){
        Queue<Integer>q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(q.size() > 0){
            int room = q.remove();
            for(int i = 0 ; i < adj.get(room).size() ; i++){
                if(! vis[adj.get(room).get(i)]){
                    q.add(adj.get(room).get(i));
                    vis[adj.get(room).get(i)] = true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[]vis = new boolean[n];
        bfs(rooms,vis,n);
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]) return false;
        }
        return true;
    }
}