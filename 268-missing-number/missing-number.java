class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int x1 = 0;
        int x2 = 0;
        for(int i = 0 ; i <= n ; i++){
            x1 = x1^i;
        }
        for(int i = 0 ; i < n ; i++){
            x2 = x2 ^ arr[i];
        }
        return x1^x2;
    }
}