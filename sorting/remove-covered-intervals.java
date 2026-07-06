class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Arrays.sort(intervals,(a,b)->Integer.compare(b[1],a[1]));
        ArrayList<int[]>arr = new ArrayList<>();
        arr.add(intervals[0]);
        for(int i = 0 ; i < n ; i++){
            int st = arr.get(arr.size()-1)[0];
            int end = arr.get(arr.size()-1)[1];
            if(intervals[i][0] >= st && intervals[i][1] <= end){
                continue;
            }
            else{
                arr.add(intervals[i]);
            }
        }
        return arr.size();
    }
}