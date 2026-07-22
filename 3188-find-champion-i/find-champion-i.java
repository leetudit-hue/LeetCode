class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int [] arr = new int[n];
        int idx = 0;
        for(int []edge : grid){
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                if(edge[i] == 1) count++;
            }
            arr[idx++] = count;
        }
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int j = 0 ; j < n ; j++){
            if(arr[j] > max){
                max = arr[j];
                ans = j;
            }
        }
        return ans;
    }
}