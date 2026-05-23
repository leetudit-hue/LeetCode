class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[]arr = new int[n+1];
        int[]ans = new int[n];
        int count = 0;
        for(int i = 0 ; i < A.length ; i++){
            arr[A[i]]++;
            arr[B[i]]++;
            if(arr[A[i]] == 2){
                count++;
            }
            if(A[i]!= B[i] && arr[B[i]] == 2){
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}