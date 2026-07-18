class Solution {
    public static boolean bfs(int n , int[][] adj , int src , int dest , boolean[] vis){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : adj){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        Queue<Integer>q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        while(q.size() > 0){
            int vertex = q.remove();
            if(vertex == dest) return true;
            for(int neighbour : graph.get(vertex)){
                if(!vis[neighbour]){
                    q.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        return bfs(n , edges , source , destination , vis);
    }
}