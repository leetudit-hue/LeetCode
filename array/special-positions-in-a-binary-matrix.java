class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int c = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 1){
                    boolean flag = true;
                    for(int k = 0 ; k < n ; k++){
                        if( k != j && mat[i][k] == 1){
                            flag = false;
                            break;
                        }
                    }
                    for(int l = 0 ; l < m ; l++){
                        if( l != i && mat[l][j] == 1){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) c++;
                }
            }
        }
        return c;
    }
}