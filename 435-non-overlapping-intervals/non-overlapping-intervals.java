class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n == 0) return 0;
        int count = 0;
        Arrays.sort(intervals , Comparator.comparingInt(a -> a[1]));
        int[]prev = intervals[0];
        for(int i = 1 ; i < n ; i++){
            if(intervals[i][0] < prev[1]){
                count++;
            }
            else{
                prev = intervals[i];
            }
        }
        return count;
    }
}