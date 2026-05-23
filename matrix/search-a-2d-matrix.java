class Solution {
    public boolean search(int[][]mat,int row,int target){
        int n = mat[0].length;
        int st = 0;
        int end = mat[0].length-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(target==mat[row][mid]){
                return true;
            }
            else if(target >= mat[row][mid]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int strow = 0;
        int endrow = matrix.length - 1;
        int m = matrix.length;
        int n = matrix[0].length;
        while(strow <= endrow){
            int midrow = strow + (endrow - strow)/2;
            if(target >= matrix[midrow][0] && target <= matrix[midrow][n-1]){
                return search(matrix,midrow,target);
            }
            else if(target >= matrix[midrow][n-1]){
                strow = midrow+1;
            }
            else{
                endrow = midrow-1;
            }
        }
        return false;
    }
}