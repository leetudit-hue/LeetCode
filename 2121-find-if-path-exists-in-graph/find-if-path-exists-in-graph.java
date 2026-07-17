class Solution {

    public static boolean bfs(int n, int[][] edges, int st, boolean[] vis, int dest) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(st);
        vis[st] = true;

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (curr == dest)
                return true;

            for (int neighbour : graph.get(curr)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        boolean[] vis = new boolean[n];

        return bfs(n, edges, source, vis, destination);
    }
}