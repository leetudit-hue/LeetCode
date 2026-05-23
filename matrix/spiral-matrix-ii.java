class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int [n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int current = 1;
        while(current <= n*n){
            for(int i = left ; i <= right && current <= n*n ; i++){
                matrix[top][i] = current++;
            }
            top++;
            for(int j = top ; j <= bottom && current <= n*n ; j++){
                matrix[j][right] = current++;
            }
            right--;
            for(int i = right ; i >= left && current <= n*n ; i--){
                matrix[bottom][i] = current++;
            }
            bottom--;
            for(int j = bottom ; j >= top && current <= n*n ; j--){
                matrix[j][left] = current++;
            }
            left++;
        }
        return matrix;
    }
}