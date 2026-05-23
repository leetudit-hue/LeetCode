class Solution {
    public int nearestValidPoint(int x, int y, int[][] p) {
        int n = p.length;
        int ans = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 0 ; i < n ; i++){
            int xi = p[i][0];
            int yi = p[i][1];
            if(x == xi || y == yi){
                // v = true;
                int a = (Math.abs(x-xi) + Math.abs(y-yi));
                if(a < ans){
                    ans = a;
                    idx = i;
                }
            }
        }
        // if(!v){
        //     return -1;
        // }
        return idx;
    }
}