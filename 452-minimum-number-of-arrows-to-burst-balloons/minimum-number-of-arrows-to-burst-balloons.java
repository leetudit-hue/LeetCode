class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 0 || n == 1) return n;
        Arrays.sort(points , (a , b) -> Integer.compare(a[1] , b[1]));
        int count = 1;
        int[] prev = points[0];
        int i = 1;
        while(i < n){
            if(points[i][0] <= prev[1]){
                i++;
                continue;
            }
            count++;
            prev = points[i];
            i++;
        }
        return count;
    }
}