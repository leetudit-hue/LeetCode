class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        char[]arr = s.toCharArray();
        int n = arr.length;
        boolean ans = true;
        for(int i = 0 ; i < n-1 ; i++){
            int a = Integer.valueOf(arr[i]);
            int b = Integer.valueOf(arr[i+1]);
            if(Math.abs(a-b)>2) return false;;
        }
        return ans;
    }
}