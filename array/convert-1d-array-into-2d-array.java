class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        if(m*n != o.length){
            return new int[0][0];
        }
        int idx = 0;
        int[][] ans = new int[m][n];
        while(idx < o.length){
            int row = idx/n;
            int col = idx%n;
            ans[row][col] = o[idx];
            idx++;
        }
        return ans;
    }
}