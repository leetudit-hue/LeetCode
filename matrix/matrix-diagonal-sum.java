class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0 ; i < mat.length ; i++){
            sum += mat[i][i];
            sum += mat[i][c-i-1];
        }
        if(r%2 != 0){
            sum -= mat[r/2][c/2];
        }
        return sum;
    }
}