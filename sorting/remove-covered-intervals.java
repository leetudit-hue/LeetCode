class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });
        int end = intervals[0][1];
        int size = 1;
        for(int i = 1 ; i < n ; i++){
            if(intervals[i][1] <= end){
                continue;
            }
            else{
                size++;
                end = intervals[i][1];
            }
        }
        return size;
    }
}