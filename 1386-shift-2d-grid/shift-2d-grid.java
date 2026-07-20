class Solution {
    public static void reverse(int[]arr , int st ,int end){
        while(st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[]arr = new int[m * n];
        int idx = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[idx++] = grid[i][j];
            }
        }
        k %= (n * m);
        List<List<Integer>>ans = new ArrayList<>();
        idx = 0;
        for(int i = 0 ; i < n ; i++){
            ans.add(new ArrayList<>());
        }
        if(k == 0){
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    ans.get(i).add(arr[idx++]);
                }
            }
            return ans;
        }
        reverse(arr , 0 , arr.length - 1);
        reverse(arr , 0 , k-1);
        reverse(arr , k , arr.length - 1);

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                ans.get(i).add(arr[idx++]);
            }
        }
        return ans;
    }
}