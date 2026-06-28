class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][]a = new int[intervals.length+1][2];
        for(int i = 0; i < intervals.length ; i++){
            a[i] = intervals[i];
        }
        a[a.length-1] = newInterval;
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        List<int[]>ans = new ArrayList<>();
        int st = a[0][0];
        int end = a[0][1];
        for(int i = 1 ; i < a.length ; i++){
            if(a[i][0]<=end){
                end = Math.max(end,a[i][1]);
            }
            else{
                ans.add(new int[]{st,end});
                st = a[i][0];
                end = a[i][1];
            }
        }
        ans.add(new int[]{st,end});
        return ans.toArray(new int[ans.size()][2]);
    }
}