class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res = new ArrayList<>();
        if(matrix.length == 0){
            return res;
        }
        int tr = 0;
        int br = matrix.length-1;
        int r = br+1;
        int lc = 0;
        int rc = matrix[0].length-1;
        int c = rc+1;
        int total = 0;
        while(total < r*c){

            for(int i = lc ; i <= rc && total < r*c ; i++){
                res.add(matrix[tr][i]);
                total++;
            }
            tr++;
            for(int i = tr ; i <= br && total < r*c ; i++){
                res.add(matrix[i][rc]);
                total++;
            }
            rc--;
            for(int i = rc ; i >= lc && total < r*c ; i--){
                res.add(matrix[br][i]);
                total++;
            }
            br--;
            for(int i = br ; i >= tr && total < r*c ; i--){
                res.add(matrix[i][lc]);
                total++;
            }
            lc++;
        }
        return res;
    }
}