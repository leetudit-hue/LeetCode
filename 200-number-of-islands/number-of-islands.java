class Solution {
    public static class Pair{
        int row;
        int col;
        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }
    public static void bfs(int row , int col , boolean[][]vis , char[][]grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair>q = new LinkedList<>();
        q.add(new Pair(row , col));
        vis[row][col] = true;
        while(q.size() > 0){
            Pair front = q.remove();
            int i = front.row;
            int j = front.col;
            if(i + 1 < m){
                if(vis[i + 1][j] == false && grid[i + 1][j] == '1'){
                    q.add(new Pair(i + 1 , j));
                    vis[i + 1][j] = true;
                }
            }
            if(j > 0){
                if(vis[i][j - 1] == false && grid[i][j - 1] == '1'){
                    q.add(new Pair(i , j - 1));
                    vis[i][j - 1] = true;
                } 
            }
            if(i > 0){
                if(vis[i - 1][j] == false && grid[i - 1][j] == '1'){
                    q.add(new Pair(i - 1 , j));
                    vis[i - 1][j] = true;
                }
            }
            if(j + 1 < n){
                if(vis[i][j + 1] == false && grid[i][j + 1] == '1'){
                    q.add(new Pair(i , j + 1));
                    vis[i][j + 1] = true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][]vis = new boolean[m][n];
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    bfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
}