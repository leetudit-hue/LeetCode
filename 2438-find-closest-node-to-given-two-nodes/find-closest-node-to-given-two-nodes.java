class Solution {
    public static void bfs(int[]edges , int node , int[]dist){
        Queue<Integer>q = new LinkedList<>();
        q.add(node);
        int dis = 0;
        while(q.size() > 0){
            int n = q.poll();
            if (dist[n] != -1) {
                continue;
            }
            dist[n] = dis++;
            if(edges[n] != -1){
                q.add(edges[n]);
            }
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[]dist1 = new int[n];
        int[]dist2 = new int[n];
        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);
        bfs(edges , node1 , dist1);
        bfs(edges , node2 , dist2);
        int answer = -1;
        int minimumDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            // Both nodes must be able to reach this node
            if (dist1[i] != -1 && dist2[i] != -1) {

                int maximumDistance =
                    Math.max(dist1[i], dist2[i]);

                if (maximumDistance < minimumDistance) {

                    minimumDistance = maximumDistance;
                    answer = i;
                }
            }
        }
        return answer;
    }
}