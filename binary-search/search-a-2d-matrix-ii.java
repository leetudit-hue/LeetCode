class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end = n-1;
        while(st <= m-1 && end >= 0){
            if(matrix[st][end] == target){
                return true;
            }
            else if(matrix[st][end]>target){
                end--;
            }
            else{
                st++;
            }
        }
        return false;
    }
}