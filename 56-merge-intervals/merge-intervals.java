class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        ArrayList<int[]>list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 0 ; i < n ; i++){
            int[]prev = list.get(list.size() - 1);
            int[]curr = intervals[i];
            if(curr[0] <= prev[1]){
                prev[0] = Math.min(curr[0] , prev[0]);
                prev[1] = Math.max(curr[1] , prev[1]);
            }
            else{
                list.add(curr);
            }
        }
        int[][]ans = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}