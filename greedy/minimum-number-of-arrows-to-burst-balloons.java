class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        int pst = points[0][0];
        int pend = points[0][1];
        int i = 1;
        int cst = 0;
        int cend = 0;
        int count = 1;
        while(i < n){
            cst = points[i][0];
            cend = points[i][1];
            if(cst > pend){
                count++;
                pst = cst;
                pend = cend;
            }
            else{
                pst = Math.max(pst,cst);
                pend = Math.min(pend,cend);
            }
            i++;
        }
        return count;
    }
}