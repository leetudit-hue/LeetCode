class Solution {
    public int Maxrow(int[][]mat , int mid){
        int max = 0;
        for(int i = 0 ; i < mat.length ; i++){
            if(mat[i][mid]>mat[max][mid]){
                max = i;
            }
        }
        return max;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int maxrow = Maxrow(mat,mid);
            int left = mid-1 >= 0 ? mat[maxrow][mid-1]:-1;
            int right = mid+1 < m ? mat[maxrow][mid+1]:-1;
            if(mat[maxrow][mid] > right && mat[maxrow][mid] > left){
                return new int[]{maxrow,mid};
            }
            else if(mat[maxrow][mid]<left){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}