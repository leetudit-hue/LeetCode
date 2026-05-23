class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][]matrixx){
        int n = matrixx.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int temp = matrixx[i][j];
                matrixx[i][j] = matrixx[j][i];
                matrixx[j][i] = temp;
            }
        }
    }
    public void reverse(int [][]matrixx){
        int n = matrixx.length;
    for(int i = 0 ; i < n ; i++){
        int left = 0;
        int right = n-1;
            while(left < right){
                int temp = matrixx[i][right];
                matrixx[i][right] = matrixx[i][left];
                matrixx[i][left] = temp;
                left++;
                right--;
            }
        }
    }
}   
