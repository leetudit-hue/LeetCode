class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i = 0;
        int count = 0;
        int j = 1;
        while(j < n){
            if(intervals[i][1]>intervals[j][0]){
                if(intervals[j][1]>intervals[i][1]){
                    j++;
                }
                else{
                    i = j;
                    j++;
                }
                count++;
            }
            else{
                i=j;
                j++;
            }
        }
        return count;
    }
}